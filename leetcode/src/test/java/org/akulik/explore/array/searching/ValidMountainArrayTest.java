package org.akulik.explore.array.searching;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ValidMountainArrayTest {

    private final ValidMountainArray validMountainArray = new ValidMountainArray();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{2, 1}, false),
                Arguments.of(new int[]{3, 5, 5}, false),
                Arguments.of(new int[]{0, 3, 2, 1}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void validMountainArray(int[] arr, boolean expected) {
        boolean result = validMountainArray.validMountainArray(arr);
        assertThat(result).isEqualTo(expected);
    }
}