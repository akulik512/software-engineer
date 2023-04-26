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
                Arguments.of(4, 3),
                Arguments.of(8, 21),
                Arguments.of(9, 34),
                Arguments.of(11, 89)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void fib(int n, int expected) {
        int result = fibonacciNumber.fib(n);
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("testData")
    void fib_v2(int n, int expected) {
        int result = fibonacciNumber.fib_v2(n);
        assertThat(result).isEqualTo(expected);
    }
}