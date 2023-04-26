package org.akulik.explore.array.inplace;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ReplaceElementsWithGreatestElementOnRightSideTest {

    private final ReplaceElementsWithGreatestElementOnRightSide replaceElementsWithGreatestElementOnRightSide = new ReplaceElementsWithGreatestElementOnRightSide();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{17, 18, 5, 4, 6, 1}, new int[]{18, 6, 6, 6, 1, -1}),
                Arguments.of(new int[]{400}, new int[]{-1})
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void replaceElements(int[] nums, int[] expected) {
        int[] result = replaceElementsWithGreatestElementOnRightSide.replaceElements(nums);
        assertThat(result).isEqualTo(expected);
    }
}