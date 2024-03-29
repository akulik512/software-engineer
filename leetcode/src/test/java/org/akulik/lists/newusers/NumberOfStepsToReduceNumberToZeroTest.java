package org.akulik.lists.newusers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfStepsToReduceNumberToZeroTest {

    private final NumberOfStepsToReduceNumberToZero numberOfStepsToReduceNumberToZero =
            new NumberOfStepsToReduceNumberToZero();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(14, 6),
                Arguments.of(8, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void numberOfSteps(int number, int expected) {
        int result = numberOfStepsToReduceNumberToZero.numberOfSteps(number);
        assertThat(result).isEqualTo(expected);
    }
}