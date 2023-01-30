package org.akulik.explore.array.deleting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveElementTest {

    private final RemoveElement removeElement = new RemoveElement();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 2, 3}, 3, 2),
                Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void removeElement(int[] nums, int val, int expected) {
        int result = removeElement.removeElement(nums, val);
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("testData")
    void removeElement_v2(int[] nums, int val, int expected) {
        int result = removeElement.removeElement_v2(nums, val);
        assertThat(result).isEqualTo(expected);
    }
}