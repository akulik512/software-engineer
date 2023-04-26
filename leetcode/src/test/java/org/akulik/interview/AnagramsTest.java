package org.akulik.interview;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class AnagramsTest {

    private final Anagrams anagrams = new Anagrams();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new String[]{"alus", "sual", "aba", "alsu", "ba", "ab", "bbaa", "baa"},
                        List.of(
                                List.of("alus", "alsu", "sual"),
                                List.of("aba", "baa"),
                                List.of("ba", "ab"),
                                List.of("bbaa")
                        )
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void anagram(String[] arr, List<List<String>> expected) {
        List<List<String>> result = anagrams.anagram(arr);
        assertThat(result).isEqualTo(expected);
    }
}