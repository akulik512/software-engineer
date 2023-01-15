package org.akulik.studyplan.leetcode75.level1.day1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class RunningSumOf1dArrayTest {

    private final RunningSumOf1dArray runningSumOf1dArray = new RunningSumOf1dArray();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 2, 3, 4},
                        new int[]{1, 3, 6, 10}
                ),
                Arguments.of(
                        new int[]{1, 1, 1, 1, 1},
                        new int[]{1, 2, 3, 4, 5}
                ),
                Arguments.of(
                        new int[]{3, 1, 2, 10, 1},
                        new int[]{3, 4, 6, 16, 17}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void runningSum(int[] nums, int[] expected) {
        int[] result = runningSumOf1dArray.runningSum(nums);
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("testData")
    void runningSumOverwrittenInput(int[] nums, int[] expected) {
        int[] result = runningSumOf1dArray.runningSumOverwrittenInput(nums);
        assertThat(result).isEqualTo(expected);
    }
}