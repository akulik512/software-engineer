package org.akulik.lists.newusers;

import java.util.Map;

// 13. Roman to Integer (easy)
// Time: O(n) - we go from the end of the string to the beginning, only once
// Space: O(1) - the amount of memory does not depend on the size of the romanValue
// (ROMAN_TO_INTEGER_MAP size is fixed, variable sizes don't depend on the size of the romanValue and etc.)
public class RomanToInteger {

    private static final Map<Character, Integer> ROMAN_TO_INTEGER_MAP = Map.of(
            'M', 1000,
            'D', 500,
            'C', 100,
            'L', 50,
            'X', 10,
            'V', 5,
            'I', 1
    );

    // IV
    public int romanToInt(final String romanValue) {
        int result = 0;
        int previousValue = 0;
        for (int i = romanValue.length() - 1; i >= 0; i--) {
            int currentValue = ROMAN_TO_INTEGER_MAP.get(romanValue.charAt(i));
            if (currentValue < previousValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            previousValue = currentValue;
        }
        return result;
    }

}
