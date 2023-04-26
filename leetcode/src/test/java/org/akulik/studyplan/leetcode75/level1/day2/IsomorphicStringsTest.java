package org.akulik.studyplan.leetcode75.level1.day2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class IsomorphicStringsTest {

    private final IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("egg", "add", true),
                Arguments.of("foo", "bar", false),
                Arguments.of("paper", "title", true)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void isIsomorphic(String s, String t, boolean expected) {
        boolean result = isomorphicStrings.isIsomorphic(s, t);
        assertThat(result).isEqualTo(expected);
    }
}