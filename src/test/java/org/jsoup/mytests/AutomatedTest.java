package org.jsoup.mytests;

import org.junit.Test;
import org.junit.Assert;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static org.junit.Assert.*;

public class AutomatedTest {




    @Test
    public void test002() throws Throwable {
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test013() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element1.textNodes();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(textNodeList7);
    }

    @Test
    public void test018() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element5 = element1.nextElementSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test022() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test028() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        boolean boolean5 = element1.hasText();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test037() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        boolean boolean12 = element4.hasText();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test040() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Node node3 = element1.previousSibling();
        java.lang.String str4 = element1.id();
        org.jsoup.select.Elements elements5 = element1.parents();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test041() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Node node22 = element18.nextSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test044() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        org.jsoup.nodes.Element element11 = element1.attr("", false);
        boolean boolean13 = element11.hasAttr("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test051() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Node node6 = element4.previousSibling();
        org.jsoup.select.Elements elements8 = element4.getElementsByTag("<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test058() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str4 = element1.attr("");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test059() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Node node3 = element1.previousSibling();
        java.lang.String str4 = element1.outerHtml();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test060() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        org.jsoup.nodes.Element element26 = element23.removeAttr("");
        java.lang.String str27 = element26.text();
        org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        org.jsoup.nodes.Element element31 = element30.clearAttributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        java.lang.String str36 = element33.normalName();
        org.jsoup.nodes.Element element37 = element33.shallowClone();
        java.util.regex.Pattern pattern39 = null;
        org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        org.jsoup.select.Elements elements44 = element42.getElementsByAttributeStarting("hi!");
        org.jsoup.select.Elements elements45 = element42.children();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(textNodeList34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements45);
    }

    @Test
    public void test061() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        java.lang.String str19 = element9.val();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element9.textNodes();
        boolean boolean21 = element1.equals((java.lang.Object) textNodeList20);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(textNodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test065() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        org.jsoup.select.Elements elements10 = element9.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element9.textNodes();
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexGreaterThan((int) (short) 10);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test066() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Element element8 = element5.previousElementSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test067() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.jsoup.nodes.Element element7 = element1.classNames((java.util.Set<java.lang.String>) strSet5);
        org.jsoup.nodes.Element element10 = element1.attr("<hi!></hi!>", "hi!");
        java.lang.String str12 = element1.attr("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test070() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        org.jsoup.nodes.Element element12 = element9.removeAttr("");
        java.lang.String str13 = element12.text();
        org.jsoup.nodes.Element element15 = element12.addClass("");
        java.lang.String str16 = element12.text();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element19.textNodes();
        org.jsoup.nodes.Element element21 = element12.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList20);
        org.jsoup.nodes.Element element22 = element4.appendChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements23 = element22.getAllElements();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNodeList20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test072() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Document document5 = element1.ownerDocument();
        org.jsoup.nodes.Element element6 = element1.root();
        org.jsoup.nodes.Element element8 = element1.val("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test074() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element9 = element4.addClass("");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValue("<hi!>\n hi!\n</hi!>", "<hi!></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test075() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Element element9 = element5.append("");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test078() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element4.root();
        org.jsoup.select.Elements elements11 = element4.getAllElements();
        org.jsoup.nodes.Element element13 = element4.toggleClass("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test079() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        org.jsoup.nodes.Element element26 = element23.removeAttr("");
        java.lang.String str27 = element26.text();
        org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        org.jsoup.nodes.Element element31 = element30.clearAttributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        java.lang.String str36 = element33.normalName();
        org.jsoup.nodes.Element element37 = element33.shallowClone();
        java.util.regex.Pattern pattern39 = null;
        org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        org.jsoup.select.Elements elements44 = element42.getElementsByAttributeStarting("hi!");
        org.jsoup.nodes.Node node45 = element42.nextSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(textNodeList34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(node45);
    }

    @Test
    public void test086() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        org.jsoup.nodes.Element element12 = element9.removeAttr("");
        java.lang.String str13 = element12.text();
        org.jsoup.nodes.Element element15 = element12.addClass("");
        java.lang.String str16 = element12.text();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element19.textNodes();
        org.jsoup.nodes.Element element21 = element12.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList20);
        org.jsoup.nodes.Element element22 = element4.appendChild((org.jsoup.nodes.Node) element21);
        java.lang.String[] strArray29 = new java.lang.String[] { "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>", "<hi!></hi!>", "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>", "", "hi!", "<hi! class=\"\"></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        org.jsoup.nodes.Element element32 = element22.classNames((java.util.Set<java.lang.String>) strSet30);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNodeList20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>", "<hi!></hi!>", "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>", "", "hi!", "<hi! class=\"\"></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test092() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element1.cssSelector();
        org.jsoup.nodes.Element element8 = element1.html("hi!");
        java.lang.String str10 = element1.absUrl("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test093() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        org.jsoup.nodes.Element element14 = element13.previousElementSibling();
        element13.setBaseUri("hi!");
        org.jsoup.select.Elements elements18 = element13.getElementsByIndexGreaterThan(10);
        org.jsoup.select.Elements elements19 = element13.previousElementSiblings();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test094() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodes();
        org.jsoup.nodes.Element element7 = element1.append("");
        org.jsoup.select.Elements elements9 = element1.getElementsByAttribute("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test095() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes();
        boolean boolean7 = element1.hasText();
        java.lang.String str8 = element1.outerHtml();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!></hi!>" + "'", str8, "<hi!></hi!>");
    }

    @Test
    public void test096() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Node node3 = element1.previousSibling();
        java.lang.String str4 = element1.id();
        org.jsoup.nodes.Element element6 = element1.removeClass("hi!");
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueNot("hi!", "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test097() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        org.jsoup.nodes.Node node4 = element1.parentNode();
        java.lang.Class<?> wildcardClass5 = element1.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test098() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.util.Set<java.lang.String> strSet8 = element4.classNames();
        org.jsoup.nodes.Document document9 = element4.ownerDocument();
        org.jsoup.select.Elements elements10 = element4.previousElementSiblings();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList13 = element12.textNodes();
        org.jsoup.nodes.Element element15 = element12.removeAttr("");
        java.lang.String str16 = element15.text();
        org.jsoup.select.Elements elements17 = element15.nextElementSiblings();
        boolean boolean18 = element4.hasSameValue((java.lang.Object) elements17);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(textNodeList13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test099() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        org.jsoup.nodes.Element element15 = element4.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element4.childNodesCopy();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test101() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element11.nextElementSibling();
        java.lang.String str14 = element11.normalName();
        org.jsoup.nodes.Element element15 = element11.shallowClone();
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = element11.getElementsByAttributeValueMatching("hi!", pattern17);
        boolean boolean19 = element9.equals((java.lang.Object) pattern17);
        org.jsoup.nodes.Element element20 = element9.clone();
        boolean boolean21 = element20.isBlock();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element20.childNodes();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test102() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.lang.String str8 = element4.wholeText();
        org.jsoup.nodes.Element element10 = element4.removeAttr("hi!");
        org.jsoup.nodes.Element element12 = element10.removeAttr("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element13 = element10.empty();
        org.jsoup.nodes.Element element15 = element13.toggleClass("");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test105() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        org.jsoup.nodes.Element element11 = element1.attr("", false);
        java.lang.String str12 = element11.tagName();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test108() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element16.nextElementSibling();
        java.lang.String str19 = element16.normalName();
        org.jsoup.nodes.Element element20 = element16.shallowClone();
        org.jsoup.nodes.Element element22 = element16.addClass("<hi!></hi!>");
        boolean boolean24 = element16.hasAttr("hi!");
        org.jsoup.nodes.Element element25 = element4.appendTo(element16);
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element25.childNodes();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test111() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.util.Set<java.lang.String> strSet8 = element4.classNames();
        org.jsoup.nodes.Document document9 = element4.ownerDocument();
        org.jsoup.select.Elements elements10 = element4.previousElementSiblings();
        org.jsoup.select.Elements elements12 = element4.getElementsByTag("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test112() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.select.Elements elements8 = element7.children();
        org.jsoup.nodes.Element element9 = element7.root();
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValue("hi!", "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test113() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element11 = element8.removeAttr("");
        java.lang.String str12 = element11.text();
        org.jsoup.nodes.Element element14 = element11.addClass("");
        java.lang.String str15 = element11.text();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element18.textNodes();
        org.jsoup.nodes.Element element20 = element11.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList19);
        java.lang.String str21 = element11.val();
        org.jsoup.select.Elements elements22 = element11.nextElementSiblings();
        org.jsoup.nodes.Element element23 = element5.appendTo(element11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = element11.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(textNodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test114() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element1.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test115() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.lang.String str8 = element4.wholeText();
        org.jsoup.nodes.Element element10 = element4.removeAttr("hi!");
        org.jsoup.nodes.Element element12 = element10.removeAttr("<hi!>\n hi!\n</hi!>");
        element12.setBaseUri("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test116() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element21.childNodes();
        org.jsoup.nodes.Element element23 = element21.empty();
        org.jsoup.nodes.Element element24 = element23.nextElementSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(element24);
    }

    @Test
    public void test117() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("<hi!></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test118() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        org.jsoup.nodes.Element element7 = element1.prependText("");
        element1.setBaseUri("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements11 = element1.getElementsByAttributeStarting("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test119() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Document document5 = element1.ownerDocument();
        org.jsoup.nodes.Element element6 = element1.root();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(textNodeList7);
    }

    @Test
    public void test120() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        org.jsoup.nodes.Element element26 = element23.removeAttr("");
        java.lang.String str27 = element26.text();
        org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        org.jsoup.nodes.Element element31 = element30.clearAttributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        java.lang.String str36 = element33.normalName();
        org.jsoup.nodes.Element element37 = element33.shallowClone();
        java.util.regex.Pattern pattern39 = null;
        org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        java.lang.String str43 = element18.className();
        org.jsoup.select.Elements elements46 = element18.getElementsByAttributeValueEnding("<hi!>\n hi!\n</hi!>", "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(textNodeList34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(elements46);
    }

    @Test
    public void test121() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.nodes.Element element15 = element4.empty();
        org.jsoup.nodes.Element element17 = element15.html("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = element15.dataset();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element20.textNodes();
        org.jsoup.nodes.Element element22 = element20.shallowClone();
        int int23 = element20.siblingIndex();
        org.jsoup.select.Elements elements24 = element20.nextElementSiblings();
        org.jsoup.nodes.Element element26 = element20.prependText("");
        org.jsoup.nodes.Element element27 = element15.appendTo(element20);
        org.jsoup.nodes.Document document28 = element20.ownerDocument();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNull(document28);
    }

    @Test
    public void test122() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Node node3 = element1.previousSibling();
        java.lang.String str4 = element1.id();
        org.jsoup.nodes.Element element6 = element1.removeClass("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        java.util.regex.Pattern pattern8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element7.getElementsMatchingOwnText(pattern8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test123() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.util.Set<java.lang.String> strSet8 = element4.classNames();
        org.jsoup.nodes.Document document9 = element4.ownerDocument();
        org.jsoup.select.Elements elements10 = element4.previousElementSiblings();
        org.jsoup.parser.Tag tag11 = element4.tag();
        org.jsoup.nodes.Element element13 = element4.getElementById("<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test124() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element4.root();
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.select.Elements elements14 = element10.getElementsByIndexGreaterThan((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element10.selectFirst("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>': unexpected token at '<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test125() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        org.jsoup.nodes.Element element26 = element23.removeAttr("");
        java.lang.String str27 = element26.text();
        org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        org.jsoup.nodes.Element element31 = element30.clearAttributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        java.lang.String str36 = element33.normalName();
        org.jsoup.nodes.Element element37 = element33.shallowClone();
        java.util.regex.Pattern pattern39 = null;
        org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        org.jsoup.select.Elements elements44 = element42.getElementsByAttributeStarting("hi!");
        boolean boolean45 = element42.isBlock();
        boolean boolean47 = element42.hasAttr("<hi!></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(textNodeList34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test126() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.jsoup.nodes.Element element7 = element1.classNames((java.util.Set<java.lang.String>) strSet5);
        org.jsoup.nodes.Element element10 = element1.attr("<hi!></hi!>", "hi!");
        java.lang.String str11 = element10.toString();
        org.jsoup.select.Elements elements13 = element10.getElementsByTag("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = element15.textNodes();
        org.jsoup.nodes.Element element18 = element15.removeAttr("");
        java.lang.String str19 = element18.text();
        org.jsoup.select.Elements elements20 = element18.nextElementSiblings();
        org.jsoup.nodes.Element element22 = element18.toggleClass("hi!");
        org.jsoup.nodes.Element element23 = element10.appendTo(element18);
        org.jsoup.select.Elements elements25 = element18.getElementsByAttribute("<hi!></hi!>");
        org.jsoup.select.NodeFilter nodeFilter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = element18.filter(nodeFilter26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>" + "'", str11, "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(textNodeList16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test127() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element3 = element1.removeAttr("<hi!></hi!>");
        org.jsoup.select.Elements elements4 = element1.nextElementSiblings();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test128() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.select.Elements elements16 = element4.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.select.Elements elements19 = element4.getElementsByAttributeValueStarting("<hi! class=\"\"></hi!>", "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test129() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element11 = element8.removeAttr("");
        java.lang.String str12 = element11.text();
        org.jsoup.nodes.Element element14 = element11.addClass("");
        java.lang.String str15 = element11.text();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element18.textNodes();
        org.jsoup.nodes.Element element20 = element11.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList19);
        java.lang.String str21 = element11.val();
        org.jsoup.select.Elements elements22 = element11.nextElementSiblings();
        org.jsoup.nodes.Element element23 = element5.appendTo(element11);
        org.jsoup.nodes.Element element25 = element11.removeAttr("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element26 = element11.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements29 = element11.getElementsByAttributeValueStarting("<hi! class=\"\"></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(textNodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test130() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        int int7 = element5.childNodeSize();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeStarting("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test132() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!></hi!>");
        org.jsoup.nodes.Element element4 = element1.attr("", "hi!.hi!");
        org.jsoup.nodes.Element element6 = element1.toggleClass("");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test133() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element4.root();
        java.lang.String str11 = element10.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element10.select("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>': unexpected token at '<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test134() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element11 = element8.removeAttr("");
        java.lang.String str12 = element11.text();
        org.jsoup.nodes.Element element14 = element11.addClass("");
        java.lang.String str15 = element11.text();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element18.textNodes();
        org.jsoup.nodes.Element element20 = element11.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList19);
        java.lang.String str21 = element11.val();
        org.jsoup.select.Elements elements22 = element11.nextElementSiblings();
        org.jsoup.nodes.Element element23 = element5.appendTo(element11);
        org.jsoup.nodes.Element element25 = element11.removeAttr("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element26 = element11.root();
        java.lang.String str27 = element26.data();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(textNodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test135() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element21.childNodes();
        org.jsoup.nodes.Element element23 = element21.empty();
        org.jsoup.nodes.Node[] nodeArray25 = new org.jsoup.nodes.Node[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = element23.insertChildren((int) (short) 100, nodeArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(nodeArray25);
        org.junit.Assert.assertArrayEquals(nodeArray25, new org.jsoup.nodes.Node[] {});
    }

    @Test
    public void test136() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        org.jsoup.nodes.Element element26 = element23.removeAttr("");
        java.lang.String str27 = element26.text();
        org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        org.jsoup.nodes.Element element31 = element30.clearAttributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        java.lang.String str36 = element33.normalName();
        org.jsoup.nodes.Element element37 = element33.shallowClone();
        java.util.regex.Pattern pattern39 = null;
        org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        org.jsoup.select.Elements elements44 = element42.getElementsByAttributeStarting("hi!");
        boolean boolean45 = element42.isBlock();
        org.jsoup.select.Elements elements48 = element42.getElementsByAttributeValueStarting("<hi!>\n hi!\n</hi!>", "hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(textNodeList34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(elements48);
    }

    @Test
    public void test137() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element11 = element8.removeAttr("");
        java.lang.String str12 = element11.text();
        org.jsoup.nodes.Element element14 = element11.addClass("");
        java.lang.String str15 = element11.text();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element18.textNodes();
        org.jsoup.nodes.Element element20 = element11.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList19);
        java.lang.String str21 = element11.val();
        org.jsoup.select.Elements elements22 = element11.nextElementSiblings();
        org.jsoup.nodes.Element element23 = element5.appendTo(element11);
        org.jsoup.nodes.Element element25 = element11.removeAttr("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element26 = element11.root();
        org.jsoup.select.Elements elements27 = element26.parents();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(textNodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test138() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        boolean boolean11 = element9.hasSameValue((java.lang.Object) "");
        boolean boolean12 = element9.hasParent();
        org.jsoup.select.Elements elements14 = element9.getElementsByIndexGreaterThan((int) (short) 10);
        org.jsoup.nodes.Node node15 = element9.nextSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test139() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element11 = element8.removeAttr("");
        java.lang.String str12 = element11.text();
        org.jsoup.nodes.Element element14 = element11.addClass("");
        java.lang.String str15 = element11.text();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element18.textNodes();
        org.jsoup.nodes.Element element20 = element11.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList19);
        java.lang.String str21 = element11.val();
        org.jsoup.select.Elements elements22 = element11.nextElementSiblings();
        org.jsoup.nodes.Element element23 = element5.appendTo(element11);
        org.jsoup.nodes.Element element25 = element11.removeAttr("<hi!>\n hi!\n</hi!>");
        java.lang.Class<?> wildcardClass26 = element25.getClass();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(textNodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test140() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        int int14 = element13.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element13.child((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test141() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        java.lang.String str14 = element13.data();
        org.jsoup.nodes.Element element16 = element13.appendText("<hi!></hi!>");
        org.jsoup.select.Elements elements18 = element16.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element19 = element16.nextElementSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test142() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        org.jsoup.nodes.Element element26 = element23.removeAttr("");
        java.lang.String str27 = element26.text();
        org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        org.jsoup.nodes.Element element31 = element30.clearAttributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        java.lang.String str36 = element33.normalName();
        org.jsoup.nodes.Element element37 = element33.shallowClone();
        java.util.regex.Pattern pattern39 = null;
        org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList45 = element44.textNodes();
        org.jsoup.nodes.Element element46 = element44.nextElementSibling();
        java.lang.String str47 = element44.normalName();
        org.jsoup.nodes.Element element48 = element44.shallowClone();
        org.jsoup.select.Elements elements51 = element44.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList54 = element53.textNodes();
        org.jsoup.nodes.Element element55 = element53.shallowClone();
        int int56 = element53.siblingIndex();
        org.jsoup.select.Elements elements57 = element53.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = element53.childNodes();
        org.jsoup.nodes.Element element60 = element53.toggleClass("");
        org.jsoup.nodes.Element element61 = element44.prependChild((org.jsoup.nodes.Node) element60);
        org.jsoup.nodes.Element element63 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList64 = element63.textNodes();
        org.jsoup.nodes.Element element66 = element63.removeAttr("");
        java.lang.String str67 = element66.text();
        org.jsoup.select.Elements elements68 = element66.nextElementSiblings();
        int int69 = element66.childNodeSize();
        java.util.Set<java.lang.String> strSet70 = element66.classNames();
        org.jsoup.nodes.Element element71 = element44.classNames(strSet70);
        org.jsoup.nodes.Element element73 = new org.jsoup.nodes.Element("hi!");
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet77 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet77, strArray76);
        org.jsoup.nodes.Element element79 = element73.classNames((java.util.Set<java.lang.String>) strSet77);
        org.jsoup.nodes.Element element80 = element44.classNames((java.util.Set<java.lang.String>) strSet77);
        org.jsoup.nodes.Element element81 = element42.classNames((java.util.Set<java.lang.String>) strSet77);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(textNodeList34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(textNodeList45);
        org.junit.Assert.assertNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(textNodeList54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(textNodeList64);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(elements68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(strSet70);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNotNull(element81);
    }

    @Test
    public void test143() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Node node6 = element4.previousSibling();
        java.lang.String str7 = element4.ownText();
        java.lang.String str9 = element4.attr("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test144() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element4.root();
        org.jsoup.select.Elements elements11 = element4.getAllElements();
        org.jsoup.nodes.TextNode[] textNodeArray13 = new org.jsoup.nodes.TextNode[] {};
        java.util.ArrayList<org.jsoup.nodes.TextNode> textNodeList14 = new java.util.ArrayList<org.jsoup.nodes.TextNode>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList14, textNodeArray13);
        org.jsoup.nodes.Element element16 = element4.insertChildren((int) (short) 0, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element4.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(textNodeArray13);
        org.junit.Assert.assertArrayEquals(textNodeArray13, new org.jsoup.nodes.TextNode[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test145() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!.hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test146() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        java.lang.String str9 = element5.attr("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test147() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        org.jsoup.select.Elements elements16 = element4.getElementsByAttributeValueContaining("hi!", "hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test148() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = element18.appendText("<hi!></hi!>");
        boolean boolean24 = element18.hasParent();
        org.jsoup.parser.Tag tag25 = element18.tag();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag25, "hi!.hi!");
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag25, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag25);
    }

    @Test
    public void test149() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        boolean boolean12 = element4.isBlock();
        org.jsoup.nodes.Element element14 = element4.append("");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test150() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Document document5 = element1.ownerDocument();
        org.jsoup.nodes.Element element6 = element1.root();
        int int7 = element6.siblingIndex();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test151() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element4.root();
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexEquals((int) (byte) 10);
        java.lang.String str13 = element10.nodeName();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test152() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.nodes.Element element15 = element4.empty();
        org.jsoup.nodes.Element element17 = element15.html("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = element15.dataset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = element15.getElementsByAttributeValueEnding("<hi!>\n hi!\n</hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test153() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        java.lang.String str14 = element13.data();
        org.jsoup.nodes.Element element16 = element13.appendText("<hi!></hi!>");
        org.jsoup.select.Elements elements18 = element16.getElementsByIndexGreaterThan((int) (byte) 100);
        java.lang.String str19 = element16.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = element16.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test154() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = element17.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test155() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes();
        org.jsoup.nodes.Element element8 = element1.toggleClass("");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = element1.dataset();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test156() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.util.Set<java.lang.String> strSet8 = element4.classNames();
        org.jsoup.nodes.Document document9 = element4.ownerDocument();
        org.jsoup.select.Elements elements10 = element4.previousElementSiblings();
        org.jsoup.parser.Tag tag11 = element4.tag();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = element13.textNodes();
        org.jsoup.nodes.Element element15 = element13.nextElementSibling();
        java.lang.String str16 = element13.normalName();
        org.jsoup.select.Elements elements18 = element13.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.nodes.Element element19 = element13.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element4.before((org.jsoup.nodes.Node) element19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(textNodeList14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test157() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        org.jsoup.nodes.Element element16 = element4.attr("<hi!>\n hi!\n</hi!>", false);
        org.jsoup.select.Elements elements17 = element16.siblingElements();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test158() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.nodes.Element element7 = element1.addClass("<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsMatchingText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element7.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test159() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        int int7 = element5.elementSiblingIndex();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test160() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Document document5 = element1.ownerDocument();
        org.jsoup.nodes.Element element6 = element1.root();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element10 = element8.shallowClone();
        org.jsoup.nodes.Element element11 = element1.appendChild((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Element element13 = element8.removeClass("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test161() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.jsoup.nodes.Element element7 = element1.classNames((java.util.Set<java.lang.String>) strSet5);
        org.jsoup.nodes.Element element10 = element1.attr("<hi!></hi!>", "hi!");
        java.lang.String str11 = element10.toString();
        org.jsoup.select.Elements elements13 = element10.getElementsByTag("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element10.childNodesCopy();
        org.jsoup.select.Elements elements17 = element10.getElementsByAttributeValueEnding("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>", "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>" + "'", str11, "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test162() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element11.nextElementSibling();
        java.lang.String str14 = element11.normalName();
        org.jsoup.nodes.Element element15 = element11.shallowClone();
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = element11.getElementsByAttributeValueMatching("hi!", pattern17);
        boolean boolean19 = element9.equals((java.lang.Object) pattern17);
        org.jsoup.nodes.Element element20 = element9.clone();
        org.jsoup.select.Elements elements22 = element20.getElementsMatchingText("hi!.hi!");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList25 = element24.textNodes();
        org.jsoup.nodes.Element element27 = element24.removeAttr("");
        java.lang.String str28 = element27.text();
        org.jsoup.nodes.Element element30 = element27.addClass("");
        java.lang.String str31 = element27.text();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList35 = element34.textNodes();
        org.jsoup.nodes.Element element36 = element27.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList35);
        java.lang.String str37 = element27.val();
        org.jsoup.nodes.Element element38 = element27.empty();
        java.lang.String str39 = element38.outerHtml();
        org.jsoup.nodes.Document document40 = element38.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element41 = element20.prependChild((org.jsoup.nodes.Node) document40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(textNodeList25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(textNodeList35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str39, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNull(document40);
    }

    @Test
    public void test163() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Node node3 = element1.previousSibling();
        java.lang.String str4 = element1.id();
        org.jsoup.nodes.Element element6 = element1.removeClass("hi!");
        org.jsoup.nodes.Element element7 = element6.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = element6.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test164() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        java.lang.String str5 = element1.baseUri();
        org.jsoup.nodes.Element element6 = element1.clearAttributes();
        java.lang.String str8 = element1.absUrl("<hi!></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test165() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Evaluator evaluator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = element2.is(evaluator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
    }

    @Test
    public void test166() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        org.jsoup.select.Elements elements14 = element13.getAllElements();
        java.lang.String str15 = element13.val();
        java.lang.String str16 = element13.tagName();
        org.jsoup.select.Elements elements17 = element13.children();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test167() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        org.jsoup.nodes.Element element26 = element23.removeAttr("");
        java.lang.String str27 = element26.text();
        org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        org.jsoup.nodes.Element element31 = element30.clearAttributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        java.lang.String str36 = element33.normalName();
        org.jsoup.nodes.Element element37 = element33.shallowClone();
        java.util.regex.Pattern pattern39 = null;
        org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        org.jsoup.select.Elements elements45 = element31.getElementsByAttributeValue("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element47 = element31.removeAttr("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        int int48 = element31.siblingIndex();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(textNodeList34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test168() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Node node3 = element1.previousSibling();
        java.lang.String str4 = element1.id();
        org.jsoup.nodes.Element element6 = element1.removeClass("hi!");
        boolean boolean7 = element6.hasText();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test169() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        java.lang.String str14 = element13.data();
        org.jsoup.nodes.Element element16 = element13.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element13.appendText("<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test170() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.nodes.Element element7 = element1.addClass("<hi!></hi!>");
        boolean boolean9 = element1.hasAttr("hi!");
        org.jsoup.select.Evaluator evaluator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = element1.is(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test171() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        org.jsoup.select.Elements elements5 = element3.getElementsByClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element6 = element3.clearAttributes();
        org.jsoup.select.NodeFilter nodeFilter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element3.filter(nodeFilter7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test172() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element20.textNodes();
        org.jsoup.nodes.Element element23 = element20.removeAttr("");
        java.lang.String str24 = element23.text();
        org.jsoup.select.Elements elements25 = element23.nextElementSiblings();
        int int26 = element23.childNodeSize();
        java.util.Set<java.lang.String> strSet27 = element23.classNames();
        org.jsoup.nodes.Element element28 = element1.classNames(strSet27);
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.jsoup.nodes.Element element36 = element30.classNames((java.util.Set<java.lang.String>) strSet34);
        org.jsoup.nodes.Element element37 = element1.classNames((java.util.Set<java.lang.String>) strSet34);
        org.jsoup.nodes.Element element39 = element1.val("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
    }

    @Test
    public void test173() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.select.Evaluator evaluator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = element18.is(evaluator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test174() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        java.lang.String str4 = element1.wholeText();
        org.jsoup.select.Elements elements5 = element1.parents();
        org.jsoup.nodes.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element1.prependChild(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test175() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        org.jsoup.select.Elements elements5 = element3.getElementsByClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element6 = element3.clearAttributes();
        org.jsoup.nodes.Element element8 = element6.removeAttr("<hi!></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test176() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.Class<?> wildcardClass8 = element7.getClass();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test177() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.lang.String str8 = element4.wholeText();
        boolean boolean10 = element4.hasClass("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = element4.is("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test178() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValue("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test179() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        org.jsoup.nodes.Element element12 = element9.removeAttr("");
        java.lang.String str13 = element12.text();
        org.jsoup.nodes.Element element15 = element12.addClass("");
        java.lang.String str16 = element12.text();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element19.textNodes();
        org.jsoup.nodes.Element element21 = element12.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList20);
        org.jsoup.nodes.Element element22 = element4.appendChild((org.jsoup.nodes.Node) element21);
        org.jsoup.nodes.Element element24 = element4.append("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element25 = element4.empty();
        org.jsoup.nodes.Element element27 = element25.val("hi!.hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNodeList20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test180() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element16.nextElementSibling();
        java.lang.String str19 = element16.normalName();
        org.jsoup.nodes.Element element20 = element16.shallowClone();
        org.jsoup.nodes.Element element22 = element16.addClass("<hi!></hi!>");
        boolean boolean24 = element16.hasAttr("hi!");
        org.jsoup.nodes.Element element25 = element4.appendTo(element16);
        java.lang.String str26 = element16.ownText();
        java.lang.Class<?> wildcardClass27 = element16.getClass();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test181() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.select.Elements elements8 = element7.children();
        org.jsoup.nodes.Element element9 = element7.root();
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        boolean boolean12 = element9.hasAttr("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node13 = element9.parentNode();
        org.jsoup.nodes.Element element14 = element9.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element14.getElementsByIndexLessThan((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test182() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        org.jsoup.nodes.Element element11 = element1.attr("", false);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element1.childNodesCopy();
        int int13 = element1.siblingIndex();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test183() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        boolean boolean11 = element9.hasSameValue((java.lang.Object) "");
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexEquals((int) '#');
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test184() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        org.jsoup.nodes.Element element12 = element9.removeAttr("");
        java.lang.String str13 = element12.text();
        org.jsoup.nodes.Element element15 = element12.addClass("");
        java.lang.String str16 = element12.text();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element19.textNodes();
        org.jsoup.nodes.Element element21 = element12.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList20);
        org.jsoup.nodes.Element element22 = element4.appendChild((org.jsoup.nodes.Node) element21);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element21.siblingNodes();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNodeList20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test185() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        boolean boolean18 = element4.equals((java.lang.Object) "");
        org.jsoup.select.Elements elements20 = element4.getElementsByIndexLessThan(100);
        org.jsoup.select.Elements elements22 = element4.getElementsByIndexGreaterThan((int) '#');
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test186() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        org.jsoup.nodes.Element element11 = element1.attr("", false);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element1.childNodesCopy();
        org.jsoup.nodes.Element element14 = element1.val("<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test187() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        java.lang.String str6 = element1.attr("hi!.hi!");
        org.jsoup.nodes.Node node7 = element1.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test188() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        org.jsoup.select.Elements elements14 = element13.siblingElements();
        java.lang.String str15 = element13.data();
        org.jsoup.select.Elements elements16 = element13.siblingElements();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test189() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.jsoup.nodes.Element element7 = element1.classNames((java.util.Set<java.lang.String>) strSet5);
        org.jsoup.nodes.Element element10 = element1.attr("<hi!></hi!>", "hi!");
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element1.getElementsMatchingOwnText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test190() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        boolean boolean18 = element4.equals((java.lang.Object) "");
        boolean boolean19 = element4.hasParent();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test191() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        java.lang.Class<?> wildcardClass10 = element8.getClass();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test192() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Node node3 = element1.previousSibling();
        java.lang.String str4 = element1.outerHtml();
        org.jsoup.select.Elements elements6 = element1.getElementsMatchingOwnText("hi!");
        java.lang.String str7 = element1.text();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test193() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element6 = element1.html("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements8 = element6.getElementsByIndexGreaterThan((int) (byte) -1);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test194() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element5.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test195() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element20.textNodes();
        org.jsoup.nodes.Element element23 = element20.removeAttr("");
        java.lang.String str24 = element23.text();
        org.jsoup.select.Elements elements25 = element23.nextElementSiblings();
        int int26 = element23.childNodeSize();
        java.util.Set<java.lang.String> strSet27 = element23.classNames();
        org.jsoup.nodes.Element element28 = element1.classNames(strSet27);
        java.lang.String str29 = element1.normalName();
        org.jsoup.nodes.Element element30 = element1.clone();
        org.jsoup.nodes.Element element32 = element30.append("<hi!></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test196() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element1.cssSelector();
        java.lang.String str7 = element1.outerHtml();
        boolean boolean8 = element1.isBlock();
        java.lang.String str9 = element1.val();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi!></hi!>" + "'", str7, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test197() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element4.root();
        java.lang.String str11 = element10.data();
        org.jsoup.nodes.Element element14 = element10.attr("<hi!>\n hi!\n</hi!>", true);
        org.jsoup.select.Elements elements16 = element10.getElementsContainingText("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test198() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.jsoup.nodes.Element element7 = element1.classNames((java.util.Set<java.lang.String>) strSet5);
        org.jsoup.nodes.Element element10 = element1.attr("<hi!></hi!>", "hi!");
        java.lang.String str11 = element10.toString();
        org.jsoup.select.Elements elements13 = element10.getElementsByTag("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = element15.textNodes();
        org.jsoup.nodes.Element element18 = element15.removeAttr("");
        java.lang.String str19 = element18.text();
        org.jsoup.select.Elements elements20 = element18.nextElementSiblings();
        org.jsoup.nodes.Element element22 = element18.toggleClass("hi!");
        org.jsoup.nodes.Element element23 = element10.appendTo(element18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element18.before("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>" + "'", str11, "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(textNodeList16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test199() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = element1.dataset();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test200() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Node node3 = element1.previousSibling();
        java.lang.String str4 = element1.outerHtml();
        org.jsoup.select.Elements elements6 = element1.getElementsMatchingOwnText("hi!");
        org.jsoup.nodes.Element element7 = element1.shallowClone();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test201() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.nodes.Element element7 = element1.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = element1.shallowClone();
        org.jsoup.nodes.Element element10 = element1.removeAttr("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        element1.setBaseUri("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test202() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.select.Elements elements6 = element1.getElementsByIndexLessThan((int) (byte) 1);
        int int7 = element1.siblingIndex();
        java.lang.String str9 = element1.attr("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList10 = element1.dataNodes();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(dataNodeList10);
    }

    @Test
    public void test203() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        org.jsoup.select.Elements elements14 = element13.siblingElements();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element19 = element16.removeAttr("");
        java.lang.String str20 = element19.text();
        org.jsoup.nodes.Element element22 = element19.addClass("");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList25 = element24.textNodes();
        org.jsoup.nodes.Element element27 = element24.removeAttr("");
        java.lang.String str28 = element27.text();
        org.jsoup.nodes.Element element30 = element27.addClass("");
        java.lang.String str31 = element27.text();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList35 = element34.textNodes();
        org.jsoup.nodes.Element element36 = element27.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList35);
        org.jsoup.nodes.Element element37 = element19.appendChild((org.jsoup.nodes.Node) element36);
        org.jsoup.nodes.Element element39 = element19.append("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element40 = element19.empty();
        // The following exception was thrown during execution in test generation
        try {
            element13.replaceWith((org.jsoup.nodes.Node) element40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(textNodeList25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(textNodeList35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test204() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.select.Elements elements16 = element4.getElementsByClass("hi!");
        java.lang.String str17 = element4.normalName();
        org.jsoup.nodes.Element element18 = element4.shallowClone();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test205() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element8 = element7.clearAttributes();
        org.jsoup.select.Elements elements9 = element7.siblingElements();
        org.jsoup.select.Elements elements12 = element7.getElementsByAttributeValueContaining("<hi!></hi!>", "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element13 = element7.empty();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test206() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        boolean boolean5 = element1.hasParent();
        org.jsoup.nodes.Element element7 = element1.getElementById("<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test207() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.select.Elements elements8 = element7.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element7.before("hi!.hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test208() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element9 = element4.addClass("<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test209() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test210() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        org.jsoup.nodes.Element element9 = element1.shallowClone();
        org.jsoup.nodes.Node node10 = element9.parentNode();
        org.jsoup.select.Elements elements12 = element9.getElementsContainingText("hi!");
        java.lang.String str13 = element9.toString();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi!></hi!>" + "'", str13, "<hi!></hi!>");
    }

    @Test
    public void test211() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element8 = element7.clearAttributes();
        org.jsoup.select.Elements elements9 = element7.siblingElements();
        org.jsoup.select.Elements elements12 = element7.getElementsByAttributeValueNot("hi!", "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test212() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        java.lang.String str7 = element4.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element4.getElementsByAttributeValueEnding("", "<hi!>\n hi!\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test213() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        java.lang.String str7 = element4.ownText();
        org.jsoup.select.Elements elements8 = element4.getAllElements();
        java.lang.String str10 = element4.attr("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Node node11 = element4.nextSibling();
        java.lang.String str12 = element4.html();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test214() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        java.lang.String str7 = element4.ownText();
        org.jsoup.select.Elements elements8 = element4.getAllElements();
        org.jsoup.select.Elements elements10 = element4.getElementsMatchingOwnText("");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test215() throws Throwable {

        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        int int7 = element5.childNodeSize();
        java.lang.Class<?> wildcardClass8 = element5.getClass();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test216() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        boolean boolean18 = element4.equals((java.lang.Object) "");
        org.jsoup.select.Elements elements21 = element4.getElementsByAttributeValue("<hi!></hi!>", "<hi! class=\"\"></hi!>");
        int int22 = element4.childNodeSize();
        org.jsoup.nodes.Node node23 = element4.previousSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test217() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        org.jsoup.nodes.Element element4 = element3.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = element4.firstElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test218() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes();
        boolean boolean7 = element1.hasText();
        org.jsoup.nodes.Element element10 = element1.attr("hi!", "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test219() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        org.jsoup.select.Elements elements14 = element13.getAllElements();
        java.lang.String str15 = element13.nodeName();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test220() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        element13.setBaseUri("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements18 = element13.getElementsByAttributeValueEnding("hi!.hi!", "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test221() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = element5.prependText("");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test222() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!></hi!>");
        java.lang.String str2 = element1.val();
        org.jsoup.nodes.Element element3 = element1.root();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test223() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element9 = element4.appendElement("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element11 = element4.prependText("<hi!></hi!>");
        org.jsoup.select.Elements elements13 = element11.getElementsMatchingOwnText("<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test224() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        org.jsoup.nodes.Element element12 = element9.removeAttr("");
        java.lang.String str13 = element12.text();
        org.jsoup.nodes.Element element15 = element12.addClass("");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = element17.textNodes();
        org.jsoup.nodes.Element element20 = element17.removeAttr("");
        java.lang.String str21 = element20.text();
        org.jsoup.nodes.Element element23 = element20.addClass("");
        java.lang.String str24 = element20.text();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList28 = element27.textNodes();
        org.jsoup.nodes.Element element29 = element20.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList28);
        org.jsoup.nodes.Element element30 = element12.appendChild((org.jsoup.nodes.Node) element29);
        boolean boolean31 = element5.equals((java.lang.Object) element29);
        org.jsoup.nodes.Element element33 = element29.removeClass("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element34 = element29.lastElementSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNodeList10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(textNodeList28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(element34);
    }

    @Test
    public void test225() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element1.cssSelector();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element11 = element8.removeAttr("");
        java.lang.String str12 = element11.text();
        org.jsoup.select.Elements elements13 = element11.nextElementSiblings();
        org.jsoup.nodes.Element element15 = element11.toggleClass("hi!");
        org.jsoup.nodes.Element element16 = element15.clearAttributes();
        org.jsoup.nodes.Element element17 = element16.clone();
        org.jsoup.nodes.Element element18 = element1.appendTo(element16);
        org.jsoup.nodes.Element element20 = element18.prependText("hi!");
        java.lang.String str21 = element18.html();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test226() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = element4.previousElementSibling();
        boolean boolean10 = element4.isBlock();
        org.jsoup.select.Elements elements12 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test227() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element11.nextElementSibling();
        java.lang.String str14 = element11.normalName();
        org.jsoup.nodes.Element element15 = element11.shallowClone();
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = element11.getElementsByAttributeValueMatching("hi!", pattern17);
        boolean boolean19 = element9.equals((java.lang.Object) pattern17);
        org.jsoup.select.Elements elements21 = element9.getElementsContainingText("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Attributes attributes22 = element9.attributes();
        java.lang.Class<?> wildcardClass23 = element9.getClass();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test228() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element11.nextElementSibling();
        java.lang.String str14 = element11.normalName();
        org.jsoup.nodes.Element element15 = element11.shallowClone();
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = element11.getElementsByAttributeValueMatching("hi!", pattern17);
        boolean boolean19 = element9.equals((java.lang.Object) pattern17);
        org.jsoup.nodes.Element element20 = element9.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = element20.dataset();
        java.lang.String str22 = element20.wholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element20.before("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test229() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.lang.String str8 = element4.wholeText();
        org.jsoup.nodes.Element element10 = element4.removeAttr("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = element13.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test230() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element11 = element8.removeAttr("");
        java.lang.String str12 = element11.text();
        org.jsoup.nodes.Element element14 = element11.addClass("");
        java.lang.String str15 = element11.text();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element18.textNodes();
        org.jsoup.nodes.Element element20 = element11.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList19);
        java.lang.String str21 = element11.val();
        org.jsoup.select.Elements elements22 = element11.nextElementSiblings();
        org.jsoup.nodes.Element element23 = element5.appendTo(element11);
        org.jsoup.select.Elements elements25 = element5.getElementsByTag("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(textNodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test231() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        int int7 = element5.childNodeSize();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        org.jsoup.nodes.Element element12 = element9.removeAttr("");
        java.lang.String str13 = element12.text();
        org.jsoup.nodes.Element element15 = element12.addClass("");
        java.lang.String str16 = element12.text();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element19.textNodes();
        org.jsoup.nodes.Element element21 = element12.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList20);
        org.jsoup.nodes.Element element22 = element21.previousElementSibling();
        org.jsoup.nodes.Element element23 = element5.appendTo(element21);
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList26 = element25.textNodes();
        org.jsoup.nodes.Element element28 = element25.removeAttr("");
        java.lang.String str29 = element28.text();
        org.jsoup.nodes.Element element31 = element28.addClass("");
        java.lang.String str32 = element28.text();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList36 = element35.textNodes();
        org.jsoup.nodes.Element element37 = element28.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList36);
        java.lang.String str38 = element28.val();
        org.jsoup.nodes.Element element39 = element28.empty();
        java.lang.String str40 = element39.ownText();
        java.lang.String str41 = element39.normalName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element42 = element21.before((org.jsoup.nodes.Node) element39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNodeList10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNodeList20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(textNodeList26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(textNodeList36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test232() throws Throwable {
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        boolean boolean5 = element1.hasParent();
        int int6 = element1.siblingIndex();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void testGetElementsMatchingTextString() {
        Document doc = Jsoup.parse("<div><p>Hello 123</p><span>World</span></div>");
        Elements els = doc.getElementsMatchingText("Hello\\s+123");
        assertNotNull(els);
        assertTrue(els.size() >= 1);
    }

    @Test
    public void testGetElementsMatchingOwnTextString() {
        Document doc = Jsoup.parse("<div>abc <span>inner</span> xyz</div><p>abc xyz</p>");
        Elements els = doc.getElementsMatchingOwnText("abc.*xyz");
        assertEquals(2, els.size());
    }

    @Test
    public void testOwnTextWithChildElements() {
        Document doc = Jsoup.parse("<div>one <span>two</span> three</div>");
        Element div = doc.selectFirst("div");
        assertEquals("one three", div.ownText());
    }

    @Test
    public void testPreserveWhitespacePre() {
        Document doc = Jsoup.parse("<pre>  a\n  b  </pre>");
        Element pre = doc.selectFirst("pre");
        assertTrue(pre.wholeText().contains("  a"));
        assertTrue(pre.text().contains("a"));
    }

    @Test
    public void testPreserveWhitespaceTextarea() {
        Document doc = Jsoup.parse("<textarea>  hello\n  world  </textarea>");
        Element ta = doc.selectFirst("textarea");
        assertTrue(ta.wholeText().contains("  hello"));
    }

    @Test
    public void testHasTextFalseAndTrue() {
        Document doc1 = Jsoup.parse("<div>   </div>");
        Element div1 = doc1.selectFirst("div");
        assertFalse(div1.hasText());

        Document doc2 = Jsoup.parse("<div><span>hi</span></div>");
        Element div2 = doc2.selectFirst("div");
        assertTrue(div2.hasText());
    }

    @Test
    public void testDataOnScript() {
        Document doc = Jsoup.parse("<script>var x = 1;</script>");
        Element script = doc.selectFirst("script");
        assertEquals("var x = 1;", script.data());
    }

    @Test
    public void testDataOnStyle() {
        Document doc = Jsoup.parse("<style>body { color: red; }</style>");
        Element style = doc.selectFirst("style");
        assertTrue(style.data().contains("color: red"));
    }

    @Test
    public void testDataEmptyOnNormalElement() {
        Document doc = Jsoup.parse("<div>hello</div>");
        Element div = doc.selectFirst("div");
        assertEquals("", div.data());
    }

    @Test
    public void testGetElementsContainingOwnText() {
        Document doc = Jsoup.parse("<div>hello <span>world</span></div><p>hello</p>");
        Elements els = doc.getElementsContainingOwnText("hello");
        assertNotNull(els);
        assertTrue(els.size() >= 1);
    }

    @Test
    public void testGetElementsMatchingOwnTextString_case2() {
        Document doc = Jsoup.parse("<div>abc <span>inner</span> xyz</div>");
        Elements els = doc.getElementsMatchingOwnText("abc.*xyz");
        assertNotNull(els);
    }

    @Test
    public void testGetElementsByAttributeValueMatching() {
        Document doc = Jsoup.parse("<div id='test123'></div><p id='abc'></p>");
        Elements els = doc.getElementsByAttributeValueMatching("id", "test.*");
        assertNotNull(els);
    }

    @Test
    public void testGetElementsMatchingTextEdge() {
        Document doc = Jsoup.parse("<div><p>123</p><span>abc</span></div>");
        Elements els = doc.getElementsMatchingText("\\d+");
        assertNotNull(els);
    }

}