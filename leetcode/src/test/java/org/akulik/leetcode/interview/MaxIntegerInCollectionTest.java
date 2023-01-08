package org.akulik.leetcode.interview;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MaxIntegerInCollectionTest {

    private final MaxIntegerInCollection maxIntegerInCollection = new MaxIntegerInCollection();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4, 5), 5),
                Arguments.of(List.of(1, 2), 2),
                Arguments.of(List.of(0), 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void findMax(List<Integer> integers, Integer expected) {
        Integer result = maxIntegerInCollection.findMax(integers);
        assertThat(result).isEqualTo(expected);
    }
}