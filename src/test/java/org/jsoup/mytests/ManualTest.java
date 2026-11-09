package org.jsoup.mytests;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ManualTest {

    @Test
    public void testBasicFragment() {
        List<Node> nodes = Parser.parseFragment("<p>Hello</p>", new Element("div"), "");
        assertEquals(1, nodes.size());
    }

    @Test
    public void testEmptyFragment() {
        List<Node> nodes = Parser.parseFragment("", new Element("div"), "");
        assertTrue(nodes.isEmpty());
    }

    @Test
    public void testNullContext() {
        List<Node> nodes = Parser.parseFragment("<p>Test</p>", null, "");
        assertNotNull(nodes);
    }

    @Test
    public void testTextOnly() {
        List<Node> nodes = Parser.parseFragment("Just text", new Element("div"), "");
        assertEquals(1, nodes.size());
    }

    @Test
    public void testMalformedHtml() {
        List<Node> nodes = Parser.parseFragment("<p><div>", new Element("div"), "");
        assertNotNull(nodes);
    }

    @Test
    public void testTableContext() {
        Element context = new Element("table");
        List<Node> nodes = Parser.parseFragment("<tr><td>Hi</td></tr>", context, "");
        assertNotNull(nodes);
    }

    @Test
    public void testScriptTag() {
        List<Node> nodes = Parser.parseFragment("<script>var a=1;</script>", new Element("div"), "");
        assertNotNull(nodes);
    }

    // @Test
    // public void testXmlParser() {
    //     List<Node> nodes = Parser.parseFragment("<a></a>", new Element("div"), "", Parser.xmlParser());
    //     assertNotNull(nodes);
    // }

    @Test
    public void testIframeContext() {
        Element context = new Element("iframe");
        List<Node> nodes = Parser.parseFragment("<div>test</div>", context, "");
        assertNotNull(nodes);
    }

    @Test
    public void testScriptContext() {
        Element context = new Element("script");
        List<Node> nodes = Parser.parseFragment("var a=1;", context, "");
        assertNotNull(nodes);
    }

    @Test
    public void testNoscriptContext() {
        Element context = new Element("noscript");
        List<Node> nodes = Parser.parseFragment("<div>test</div>", context, "");
        assertNotNull(nodes);
    }

    @Test
    public void testPlaintextContext() {
        Element context = new Element("plaintext");
        List<Node> nodes = Parser.parseFragment("hello world", context, "");
        assertNotNull(nodes);
    }
}