package org.akulik.leetcode.tophundred.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class WordPatternTest {

    private final WordPattern wordPattern = new WordPattern();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("abba", "dog cat cat dog", true),
                Arguments.of("abba", "dog cat cat fish", false),
                Arguments.of("aaaa", "dog cat cat dog", false),
                Arguments.of("aaaaaaaaaa", "dog cat cat dog", false)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void twoSum(String pattern, String s, boolean expected) {
        boolean result = wordPattern.wordPattern(pattern, s);
        assertThat(result).isEqualTo(expected);
    }

}