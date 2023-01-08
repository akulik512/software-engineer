package org.akulik.leetcode.lists.newusers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(5, List.of("1", "2", "Fizz", "4", "Buzz")),
                Arguments.of(15, List.of("1", "2", "Fizz", "4", "Buzz",
                        "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"))
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void fizzBuzz(int range, List<String> expected) {
        List<String> result = fizzBuzz.fizzBuzz(range);
        assertThat(result).isEqualTo(expected);
    }
}