package org.akulik.explore.array.intro;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MaxConsecutiveOnesTest {

    private final MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 0, 1, 1, 1}, 3),
                Arguments.of(new int[]{1, 0, 1, 1, 0, 1}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void findMaxConsecutiveOnes(int[] nums, int expected) {
        int result = maxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        assertThat(result).isEqualTo(expected);
    }
}