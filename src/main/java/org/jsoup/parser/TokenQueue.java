package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

/**
 * A character queue with parsing helpers.
 *
 * @author Jonathan Hedley
 */
public class TokenQueue {
    private static final char ESC = '\\';
    private static final char EMPTY_CHAR = 0;
    private static final int NOT_FOUND = -1;
    private static final int START_TAG_MIN_LENGTH = 2;
    private static final int FIRST_CHARACTER_INDEX = 0;
    private static final int SECOND_CHARACTER_OFFSET = 1;

    private String queue;
    private int pos;

    /**
     Create a new TokenQueue.
     @param data string of data to back queue.
     */
    public TokenQueue(String data) {
        Validate.notNull(data);
        queue = data;
        pos = 0;
    }

    /**
     * Is the queue empty?
     * @return true if no data left in queue.
     */
    public boolean isEmpty() {
        return remainingLength() == 0;
    }

    private int remainingLength() {
        return queue.length() - pos;
    }

    /**
     * Retrieves but does not remove the first character from the queue.
     * @return First character, or 0 if empty.
     */
    public char peek() {
        char next = EMPTY_CHAR;
        if (!isEmpty()) {
            next = queue.charAt(pos);
        }
        return next;
    }

    /**
     Add a character to the start of the queue (will be the next character retrieved).
     @param c character to add
     */
    public void addFirst(Character c) {
        addFirst(c.toString());
    }

    /**
     Add a string to the start of the queue.
     @param seq string to add.
     */
    public void addFirst(String seq) {
        queue = seq + queue.substring(pos);
        pos = 0;
    }

    /**
     * Tests if the next characters on the queue match the sequence. Case insensitive.
     * @param seq String to check queue for.
     * @return true if the next characters match.
     */
    public boolean matches(String seq) {
        return queue.regionMatches(true, pos, seq, 0, seq.length());
    }

    /**
     * Case sensitive match test.
     * @param seq string to case sensitively check for
     * @return true if matched, false if not
     */
    public boolean matchesCS(String seq) {
        return queue.startsWith(seq, pos);
    }

    /**
     Tests if the next characters match any of the sequences. Case insensitive.
     @param seq list of strings to case insensitively check for
     @return true of any matched, false if none did
     */
    public boolean matchesAny(String... seq) {
        boolean matched = false;
        for (String s : seq) {
            if (matches(s)) {
                matched = true;
                break;
            }
        }
        return matched;
    }

    /**
     * Tests if the next characters match any of the sequences.
     * @param seq list of characters to check for
     * @return true if any matched, false if none did
     */
    public boolean matchesAny(char... seq) {
        boolean matched = false;
        if (!isEmpty()) {
            for (char c : seq) {
                if (queue.charAt(pos) == c) {
                    matched = true;
                    break;
                }
            }
        }
        return matched;
    }

    /**
     * Tests if the queue matches a start tag.
     * @return true if queue matches a start tag
     */
    public boolean matchesStartTag() {
        boolean hasStartTagLength = remainingLength() >= START_TAG_MIN_LENGTH;
        boolean startsWithOpen = hasStartTagLength && queue.charAt(pos) == '<';
        return startsWithOpen && Character.isLetter(queue.charAt(pos + SECOND_CHARACTER_OFFSET));
    }

    /**
     * Tests if the queue matches the sequence (as with match), and if they do, removes
     * the matched string from the queue.
     * @param seq String to search for, and if found, remove from queue.
     * @return true if found and removed, false if not found.
     */
    public boolean matchChomp(String seq) {
        boolean matched = matches(seq);
        if (matched) {
            pos += seq.length();
        }
        return matched;
    }

    /**
     Tests if queue starts with a whitespace character.
     @return if starts with whitespace
     */
    public boolean matchesWhitespace() {
        return !isEmpty() && StringUtil.isWhitespace(queue.charAt(pos));
    }

    /**
     Test if the queue matches a word character (letter or digit).
     @return if matches a word character
     */
    public boolean matchesWord() {
        return !isEmpty() && Character.isLetterOrDigit(queue.charAt(pos));
    }

    /**
     * Drops the next character off the queue.
     */
    public void advance() {
        if (!isEmpty()) {
            pos++;
        }
    }

    /**
     * Consume one character off queue.
     * @return first character on queue.
     */
    public char consume() {
        char consumed = queue.charAt(pos);
        pos++;
        return consumed;
    }

    /**
     * Consumes the supplied sequence of the queue. If the queue does not start with the
     * supplied sequence, will throw an illegal state exception -- but you should be
     * running match() against that condition.
     <p>
     Case insensitive.
     * @param seq sequence to remove from head of queue.
     */
    public void consume(String seq) {
        if (!matches(seq)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }

        int len = seq.length();
        if (len > remainingLength()) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        pos += len;
    }

    /**
     * Pulls a string off the queue, up to but exclusive of the match sequence, or to
     * the queue running out.
     * @param seq String to end on (and not include in return, but leave on queue).
     * <b>Case sensitive.</b>
     * @return The matched data consumed from queue.
     */
    public String consumeTo(String seq) {
        String consumed;
        int offset = queue.indexOf(seq, pos);
        if (offset != NOT_FOUND) {
            consumed = queue.substring(pos, offset);
            pos += consumed.length();
        } else {
            consumed = remainder();
        }
        return consumed;
    }

    /**
     * Pulls a string off the queue to the match sequence, ignoring case.
     * @param seq String to end on.
     * @return The matched data consumed from queue.
     */
    public String consumeToIgnoreCase(String seq) {
        int start = pos;
        String first = seq.substring(FIRST_CHARACTER_INDEX, SECOND_CHARACTER_OFFSET);
        boolean canScan = first.toLowerCase().equals(first.toUpperCase());
        while (!isEmpty() && !matches(seq)) {
            consumeToIgnoreCaseNext(first, canScan);
        }

        return queue.substring(start, pos);
    }

    private void consumeToIgnoreCaseNext(String first, boolean canScan) {
        if (canScan) {
            scanToFirstCharacter(first);
        } else {
            pos++;
        }
    }

    private void scanToFirstCharacter(String first) {
        int skip = queue.indexOf(first, pos) - pos;
        if (skip == 0) {
            pos++;
        } else if (skip < 0) {
            pos = queue.length();
        } else {
            pos += skip;
        }
    }

    /**
     Consumes to the first sequence provided, or to the end of the queue. Leaves the
     terminator on the queue.
     @param seq any number of terminators to consume to. <b>Case insensitive.</b>
     @return consumed string
     */
    public String consumeToAny(String... seq) {
        int start = pos;
        while (!isEmpty() && !matchesAny(seq)) {
            pos++;
        }

        return queue.substring(start, pos);
    }

    /**
     * Pulls a string off the queue.
     *
     * @param seq String to match up to.
     * @return Data matched from queue.
     */
    public String chompTo(String seq) {
        String data = consumeTo(seq);
        matchChomp(seq);
        return data;
    }

    /**
     * Pulls a string off the queue to the match sequence, ignoring case.
     * @param seq String to match up to.
     * @return Data matched from queue.
     */
    public String chompToIgnoreCase(String seq) {
        String data = consumeToIgnoreCase(seq);
        matchChomp(seq);
        return data;
    }

    /**
     * Pulls a balanced string off the queue.
     *
     * @param open opener
     * @param close closer
     * @return data matched from the queue
     */
    public String chompBalanced(char open, char close) {
        BalanceScan scan = new BalanceScan();

        do {
            if (isEmpty()) {
                break;
            }
            scan.consumeNext(open, close);
        } while (scan.depth > 0);

        String out = scan.output();
        if (scan.depth > 0) {
            Validate.fail("Did not find balanced marker at '" + out + "'");
        }
        return out;
    }

    private final class BalanceScan {
        private int start = NOT_FOUND;
        private int end = NOT_FOUND;
        private int depth;
        private char last = EMPTY_CHAR;
        private boolean inSingleQuote;
        private boolean inDoubleQuote;

        private void consumeNext(char open, char close) {
            char c = consume();
            if (last != ESC) {
                updateQuotes(c, open);
                if (!inSingleQuote && !inDoubleQuote) {
                    updateDepth(c, open, close);
                }
            }

            if (depth > 0 && last != EMPTY_CHAR) {
                end = pos;
            }
            last = c;
        }

        private void updateQuotes(char c, char open) {
            if (c == '\'' && c != open && !inDoubleQuote) {
                inSingleQuote = !inSingleQuote;
            } else if (c == '"' && c != open && !inSingleQuote) {
                inDoubleQuote = !inDoubleQuote;
            }
        }

        private void updateDepth(char c, char open, char close) {
            if (c == open) {
                depth++;
                if (start == NOT_FOUND) {
                    start = pos;
                }
            } else if (c == close) {
                depth--;
            }
        }

        private String output() {
            String out = "";
            if (end >= 0) {
                out = queue.substring(start, end);
            }
            return out;
        }
    }

    /**
     * Unescape a \ escaped string.
     * @param in backslash escaped string
     * @return unescaped string
     */
    public static String unescape(String in) {
        StringBuilder out = StringUtil.borrowBuilder();
        char last = EMPTY_CHAR;
        for (char c : in.toCharArray()) {
            if (c == ESC) {
                if (last == ESC) {
                    out.append(c);
                }
            } else {
                out.append(c);
            }
            last = c;
        }
        return StringUtil.releaseBuilder(out);
    }

    /**
     * Pulls the next run of whitespace characters of the queue.
     * @return Whether consuming whitespace or not
     */
    public boolean consumeWhitespace() {
        boolean seen = false;
        while (matchesWhitespace()) {
            pos++;
            seen = true;
        }
        return seen;
    }

    /**
     * Retrieves the next run of word type (letter or digit) off the queue.
     * @return String of word characters from queue, or empty string if none.
     */
    public String consumeWord() {
        int start = pos;
        while (matchesWord()) {
            pos++;
        }
        return queue.substring(start, pos);
    }

    /**
     * Consume an tag name off the queue (word or :, _, -)
     *
     * @return tag name
     */
    public String consumeTagName() {
        int start = pos;
        while (!isEmpty() && isTagNameCharacter()) {
            pos++;
        }

        return queue.substring(start, pos);
    }

    private boolean isTagNameCharacter() {
        return matchesWord() || matchesAny(':', '_', '-');
    }

    /**
     * Consume a CSS element selector (tag name, but | instead of : for namespaces
     * (or *| for wildcard namespace),
     * to not conflict with :pseudo selects).
     *
     * @return tag name
     */
    public String consumeElementSelector() {
        int start = pos;
        while (!isEmpty() && isElementSelectorCharacter()) {
            pos++;
        }

        return queue.substring(start, pos);
    }

    private boolean isElementSelectorCharacter() {
        return matchesWord() || matchesAny("*|", "|", "_", "-");
    }

    /**
     Consume a CSS identifier (ID or class) off the queue (letter, digit, -, _)
     http://www.w3.org/TR/CSS2/syndata.html#value-def-identifier
     @return identifier
     */
    public String consumeCssIdentifier() {
        int start = pos;
        while (!isEmpty() && isCssIdentifierCharacter()) {
            pos++;
        }
        return queue.substring(start, pos);
    }

    private boolean isCssIdentifierCharacter() {
        return matchesWord() || matchesAny('-', '_');
    }

    /**
     Consume an attribute key off the queue (letter, digit, -, _, :")
     @return attribute key
     */
    public String consumeAttributeKey() {
        int start = pos;
        while (!isEmpty() && isAttributeKeyCharacter()) {
            pos++;
        }

        return queue.substring(start, pos);
    }

    private boolean isAttributeKeyCharacter() {
        return matchesWord() || matchesAny('-', '_', ':');
    }

    /**
     Consume and return whatever is left on the queue.
     @return remained of queue.
     */
    public String remainder() {
        final String remainder = queue.substring(pos, queue.length());
        pos = queue.length();
        return remainder;
    }

    @Override
    public String toString() {
        return queue.substring(pos);
    }
}
