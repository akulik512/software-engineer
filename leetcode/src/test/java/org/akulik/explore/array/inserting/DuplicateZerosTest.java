package org.akulik.explore.array.inserting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class DuplicateZerosTest {

    private final DuplicateZeros duplicateZeros = new DuplicateZeros();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, 2, 3, 0, 4, 5, 0}, new int[]{1, 0, 0, 2, 3, 0, 0, 4}),
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void duplicateZeros(int[] nums, int[] expected) {
        int[] result = duplicateZeros.duplicateZeros(nums);
        assertThat(result).isEqualTo(expected);
    }
}