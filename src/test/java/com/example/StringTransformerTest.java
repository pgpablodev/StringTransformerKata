package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTransformerTest {
    @Test
    void returnSameChar() {
        assertEquals("a", StringTransformer.removeHtmlTags("a"));
    }

    @Test
    void returnSameStringWithBlanks() {
        assertEquals("a b c", StringTransformer.removeHtmlTags("a b c"));
    }

    @Test
    void returnDifferentStringWithLowerSymbol() {
        assertNotEquals("a<c", StringTransformer.removeHtmlTags("a<c"));
    }

    @Test
    void returnDifferentStringWithGreaterSymbol() {
        assertNotEquals("a>c", StringTransformer.removeHtmlTags("a<c"));
    }

    @Test
    void removesHtmlTags() {
        assertEquals("OK", StringTransformer.removeHtmlTags("<p>OK</p>"));
    }

    @Test
    void removesHtmlTagsWithoutTrimming() {
        assertEquals("   OK ", StringTransformer.removeHtmlTags("<p>   OK </p> "));
    }
}
