package org.akulik.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class RansomNoteTest {

    private final RansomNote ransomNote = new RansomNote();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("a", "b", false),
                Arguments.of("aa", "ab", false),
                Arguments.of("aa", "aab", true)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void canConstruct(String ransom, String magazine, boolean expectedResult) {
        boolean actualResult = ransomNote.canConstruct(ransom, magazine);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

}