package org.akulik.explore.array.deleting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesFromSortedArrayTest {

    private final RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray =
            new RemoveDuplicatesFromSortedArray();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2}, 2),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void removeDuplicates(int[] nums, int expected) {
        int result = removeDuplicatesFromSortedArray.removeDuplicates(nums);
        assertThat(result).isEqualTo(expected);
    }
}