package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralTest {

    RomanNumeral converter = new RomanNumeral();

    // ✅ Single Letters
    @Test
    void testSingleLetters() {
        assertEquals(1, converter.romanToInt("I"));
        assertEquals(5, converter.romanToInt("V"));
        assertEquals(10, converter.romanToInt("X"));
        assertEquals(50, converter.romanToInt("L"));
        assertEquals(100, converter.romanToInt("C"));
        assertEquals(500, converter.romanToInt("D"));
        assertEquals(1000, converter.romanToInt("M"));
    }

    // ✅ Many Letters
    @Test
    void testManyLetters() {
        assertEquals(11, converter.romanToInt("XI"));
    }

    // ✅ Subtractive Notation (SN)
    @Test
    void testSubtractiveNotation() {
        assertEquals(4, converter.romanToInt("IV"));
    }

    // ✅ With and Without SN
    @Test
    void testWithAndWithoutSN() {
        assertEquals(14, converter.romanToInt("XIV"));  // with SN
        assertEquals(15, converter.romanToInt("XV"));   // without SN
    }

    // ✅ Repetition
    @Test
    void testRepetition() {
        assertEquals(2, converter.romanToInt("II"));
    }

    // ✅ First Number
    @Test
    void testFirstNumber() {
        assertEquals(1, converter.romanToInt("I"));
    }

    // ✅ Invalid Letter
    @Test
    void testInvalidLetter() {
        assertThrows(IllegalArgumentException.class, () -> {
            converter.romanToInt("Z");
        });
    }

    // ✅ Invalid + Valid Letters
    @Test
    void testInvalidAndValidLetter() {
        assertThrows(IllegalArgumentException.class, () -> {
            converter.romanToInt("XIZ");
        });
    }

    // ✅ Not Valid (VV is invalid repetition for V)
    @Test
    void testInvalidRepetition() {
        assertThrows(IllegalArgumentException.class, () -> {
            converter.romanToInt("VV");
        });
    }

    // ✅ Null Input
    @Test
    void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            converter.romanToInt(null);
        });
    }
}
