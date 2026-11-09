import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test void t10() {
        int result = Main.methodConstants(10);
        assertEquals(4, result);
    }

    @Test void t151() {
        int result = Main.methodConstants(151);
        assertEquals(11, result);
    }

    ////////////////////////////////////////////////////////////////

    @Test void tHiddenValue10() {
        int result = Main.methodHiddenInput(${INPUT_1}/* some hidden value that will end up in MainTest.java source */);
        assertEquals(4, result);
    }

    @Test void tHiddenValue151() {
        int result = Main.methodHiddenInput(${INPUT_2}/* some hidden value that will end up in MainTest.java source */);
        assertEquals(11, result);
    }

    ////////////////////////////////////////////////////////////////

    @Test void tMultipleCalls10and151() {
        int result = Main.methodMultipleCalls(${INPUT_1}/* some hidden value */);
        assertEquals(4, result);
        result = Main.methodMultipleCalls(${INPUT_2}/* some hidden value */);
        assertEquals(11, result);
    }
    @Test void nothing() { /* just to have two tests */ }

    ////////////////////////////////////////////////////////////////

    @Test void tHiddenExpected10() {
        int result = Main.methodHiddenExpected(${INPUT_1}/* some hidden value */);
        assertEquals(${EXPECTED_1}/* some hidden value */, result);
    }
    @Test void tHiddenExpected151() {
        int result = Main.methodHiddenExpected(${INPUT_2}/* some hidden value */);
        assertEquals(${EXPECTED_2}/* some hidden value */, result);
    }

    ////////////////////////////////////////////////////////////////

    private int expected;
    @Test void tPrivateField10() {
        int input = 10;
        expected = ${CODE_1}; // some expression over `input`
        int actual = Main.methodPrivateField(input);
        assertEquals(expected, actual);
    }
    @Test void tPrivateField151() {
        int input = 151;
        expected = ${CODE_1}; // some expression over input
        int actual = Main.methodPrivateField(input);
        assertEquals(expected, actual);
    }

    ////////////////////////////////////////////////////////////////

    private static int ourHiddenOracleMethod(int input) {
        ${ORACLE_CODE}
    }
    @Test void tHiddenOracle10() {
        int input = 10;
        int actual = Main.methodHiddenOracle(input);
        int expected = ourHiddenOracleMethod(input);
        assertEquals(expected, actual);
    }
    @Test void tHiddenOracle151() {
        int input = 151;
        int actual = Main.methodHiddenOracle(input);
        int expected = ourHiddenOracleMethod(input);
        assertEquals(expected, actual);
    }

    ////////////////////////////////////////////////////////////////

    private static int cryptoHash(int x) {
        try {
            java.security.MessageDigest md =
                java.security.MessageDigest.getInstance("MD5");
            byte[] bytes = java.nio.ByteBuffer.allocate(4).putInt(x).array();
            byte[] digest = md.digest(bytes);
            return java.nio.ByteBuffer.wrap(digest).getInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test @Timeout(3) void tCryptoHash10() {
        int actual = Main.methodCryptoHash(10);
        assertEquals(4, cryptoHash(actual));
    }
    @Test @Timeout(3) void tCryptoHash151() {
        int actual = Main.methodCryptoHash(151);
        assertEquals(11, cryptoHash(actual));
    }

    ////////////////////////////////////////////////////////////////

    private void helper(int maxIterations) {
        int n = Math.abs((int)(System.nanoTime())) % maxIterations + 1;
        for (int i = 0; i < n; i++) {
            int input = Math.abs((int)(System.nanoTime())) % (Integer.MAX_VALUE / 4 + 1);
            System.out.println("input = " + input + " i = " + i + " n = " + n);
            int actual = Main.methodHelper(input);
            int expected = ${HIDDEN_CODE} /* some hidden computation over `input` */;
            assertEquals(expected, actual);
        }
    }
    @Test @Timeout(3) void tHelper10() {
        helper(10);
    }
    @Test @Timeout(3) void tHelper151() {
        helper(151);
    }
}
