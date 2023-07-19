package com.akulik.algorithm;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class BinarySearchTest {

    BinarySearch binarySearch = new BinarySearch();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 6}, 5, 2),
                Arguments.of(new int[]{1, 3, 5, 6}, 2, -1),
                Arguments.of(new int[]{1, 3, 5, 6}, 7, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void binarySearch(int[] nums, int target, int expected) {
        int result = binarySearch.binarySearch(nums, target);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}