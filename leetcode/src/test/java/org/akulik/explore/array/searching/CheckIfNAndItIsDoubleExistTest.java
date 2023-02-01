package org.akulik.explore.array.searching;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CheckIfNAndItIsDoubleExistTest {

    private final CheckIfNAndItIsDoubleExist checkIfNAndItIsDoubleExist = new CheckIfNAndItIsDoubleExist();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{10, 2, 5, 3}, true),
                Arguments.of(new int[]{3, 1, 7, 11}, false),
                Arguments.of(new int[]{7, 1, 14, 11}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void checkIfExist(int[] arr, boolean expected) {
        boolean result = checkIfNAndItIsDoubleExist.checkIfExist(arr);
        assertThat(result).isEqualTo(expected);
    }
}