package org.example.homework13;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.lang3.StringUtils;

import org.junit.Test;

public class StringUtilsTests {
    @Test
    public void testIsEmpty() {
        String emptyString = "";
        String notEmptyString = "Hello";

        assertTrue(StringUtils.isEmpty(emptyString));
        assertFalse(StringUtils.isEmpty(notEmptyString));
    }

    @Test
    public void testIsBlank() {
        String blankString = "   ";
        String notBlankString = "Hello";

        assertTrue(StringUtils.isBlank(blankString));
        assertFalse(StringUtils.isBlank(notBlankString));
    }

    @Test
    public void testTrim() {
        String stringWithWhitespace = "  Hello  ";
        String stringWithoutWhitespace = "Hello";

        assertEquals(stringWithoutWhitespace, StringUtils.trim(stringWithWhitespace));
    }

    @Test
    public void testSubstring() {
        String inputString = "Hello world";
        String expectedSubstring = "world";

        assertEquals(expectedSubstring, StringUtils.substring(inputString, 6));
        assertEquals(expectedSubstring, StringUtils.substring(inputString, 6, 11));
    }

    @Test
    public void testJoin() {
        String[] stringsToJoin = {"one", "two", "three"};
        String expectedString = "one, two, three";

        assertEquals(expectedString, StringUtils.join(stringsToJoin, ", "));
    }

    @Test
    public void testReplace() {
        String originalString = "Hello, world!";
        String replacedString = StringUtils.replace(originalString, "world", "UnitTests");
        String expectedString = "Hello, UnitTests!";

        assertEquals(expectedString, replacedString);
    }

    @Test
    public void testEquals() {
        String string1 = "hello";
        String string2 = "hello";
        String string3 = "world";

        assertTrue(StringUtils.equals(string1, string2));
        assertFalse(StringUtils.equals(string1, string3));
    }

    @Test
    public void testContains() {
        String inputString = "Hello, world!";
        String targetSubstring  = "world";
        String nonExistentSubstring  = "universe";

        assertTrue(StringUtils.contains(inputString, targetSubstring ));
        assertFalse(StringUtils.contains(inputString, nonExistentSubstring));
    }

    @Test
    public void testStartsWith() {
        String inputString = "Hello, world!";
        String prefix1 = "Hello";
        String prefix2 = "world";

        assertTrue(StringUtils.startsWith(inputString, prefix1));
        assertFalse(StringUtils.startsWith(inputString, prefix2));
    }

    @Test
    public void testEndsWith() {
        String inputString = "Hello, world!";
        String suffix1 = "Hello";
        String suffix2 = "world!";

        assertTrue(StringUtils.endsWith(inputString, suffix2));
        assertFalse(StringUtils.endsWith(inputString, suffix1));
    }
}