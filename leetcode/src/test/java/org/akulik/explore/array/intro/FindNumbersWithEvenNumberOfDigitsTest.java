package org.akulik.explore.array.intro;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FindNumbersWithEvenNumberOfDigitsTest {

    private final FindNumbersWithEvenNumberOfDigits findNumbersWithEvenNumberOfDigits = new FindNumbersWithEvenNumberOfDigits();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{12, 345, 2, 6, 7896}, 2),
                Arguments.of(new int[]{555, 901, 482, 1771}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void findNumbers(int[] nums, int expected) {
        int result = findNumbersWithEvenNumberOfDigits.findNumbers(nums);
        assertThat(result).isEqualTo(expected);
    }
}