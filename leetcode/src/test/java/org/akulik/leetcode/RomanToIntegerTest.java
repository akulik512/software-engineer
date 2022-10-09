package org.akulik.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {

    final RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    void romanToInt() {
        Integer result = romanToInteger.romanToInt("MCMXCIV");
        assertEquals(1994, result);
    }

}