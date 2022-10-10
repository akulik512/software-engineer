package org.akulik.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {

    private final RomanToInteger romanToInteger = new RomanToInteger();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void romanToInt(final String testData, final int expectedResult) {
        final Integer result = romanToInteger.romanToInt(testData);
        assertEquals(expectedResult, result);
    }

}