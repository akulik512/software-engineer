package org.akulik.leetcode.newusers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    private static Stream<Arguments> twoSumBruteForceTestData() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1})
        );
    }

    private static Stream<Arguments> twoSumTestData() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("twoSumTestData")
    void twoSum(final int[] nums, final int target, final int[] expected) {
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("twoSumBruteForceTestData")
    void twoSumBruteForce(final int[] nums, final int target, final int[] expected) {
        int[] result = twoSum.twoSumBruteForce(nums, target);
        assertArrayEquals(expected, result);
    }

}