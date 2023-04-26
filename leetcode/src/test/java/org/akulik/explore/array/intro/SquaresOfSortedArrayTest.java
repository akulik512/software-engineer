package org.akulik.explore.array.intro;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SquaresOfSortedArrayTest {

    private final SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{-4, -1, 0, 3, 10}, new int[]{0, 1, 9, 16, 100}),
                Arguments.of(new int[]{-7, -3, 2, 3, 11}, new int[]{4, 9, 9, 49, 121})
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void sortedSquares(int[] nums, int[] expected) {
        int[] result = squaresOfSortedArray.sortedSquares(nums);
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("testData")
    void official(int[] nums, int[] expected) {
        int[] result = squaresOfSortedArray.official(nums);
        assertThat(result).isEqualTo(expected);
    }
}