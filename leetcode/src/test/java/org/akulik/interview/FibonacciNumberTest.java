package org.akulik.interview;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciNumberTest {

    private final FibonacciNumber fibonacciNumber = new FibonacciNumber();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(4, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void fib(int n, int expected) {
        int result = fibonacciNumber.fib(n);
        assertThat(result).isEqualTo(expected);
    }
}