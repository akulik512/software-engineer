package org.akulik.leetcode;

import java.util.Map;

/**
 * 13. Roman to Integer
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 */
public class RomanToInteger {

    public int romanToInt(String romanValue) {
        final Map<Character, Integer> dictionary = Map.of(
                'M', 1000,
                'D', 500,
                'C', 100,
                'L', 50,
                'X', 10,
                'V', 5,
                'I', 1
        );
        int result = 0;
        int prev = 0;
        for (int i = romanValue.length() - 1; i >= 0; i--) {
            int current = dictionary.get(romanValue.charAt(i));
            if (current < prev) {
                result -= current;
            } else {
                result += current;
            }
            prev = current;
        }
        return result;
    }

}
