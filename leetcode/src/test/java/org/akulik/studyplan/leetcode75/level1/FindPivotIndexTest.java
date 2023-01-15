package org.akulik.studyplan.leetcode75.level1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FindPivotIndexTest {

    private final FindPivotIndex findPivotIndex = new FindPivotIndex();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 7, 3, 6, 5, 6},
                        3
                ),
                Arguments.of(
                        new int[]{1, 2, 3},
                        -1
                ),
                Arguments.of(
                        new int[]{2, 1, -1},
                        0
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void pivotIndex(int[] nums, int expected) {
        int result = findPivotIndex.pivotIndex(nums);
        assertThat(result).isEqualTo(expected);
    }
}