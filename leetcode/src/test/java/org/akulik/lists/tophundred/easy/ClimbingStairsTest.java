package org.akulik.lists.tophundred.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ClimbingStairsTest {

    private final ClimbingStairs climbingStairs = new ClimbingStairs();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(2, 2),
                Arguments.of(3, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void climbStairs(int n, int expected) {
        int result = climbingStairs.climbStairs(n);
        assertThat(result).isEqualTo(expected);
    }
}