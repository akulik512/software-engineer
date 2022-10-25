package org.akulik.leetcode.newusers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TheKWeakestRowsInMatrixTest {

    private final TheKWeakestRowsInMatrix theKWeakestRowsInMatrix = new TheKWeakestRowsInMatrix();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                {1, 1, 0, 0, 0},
                                {1, 1, 1, 1, 0},
                                {1, 0, 0, 0, 0},
                                {1, 1, 0, 0, 0},
                                {1, 1, 1, 1, 1}
                        },
                        3,
                        new int[]{2, 0, 3}
                ),
                Arguments.of(
                        new int[][]{
                                {1, 0, 0, 0},
                                {1, 1, 1, 1},
                                {1, 0, 0, 0},
                                {1, 0, 0, 0}
                        },
                        2,
                        new int[]{0, 2}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void kWeakestRows(int[][] mat, int k, int[] expected) {
        int[] actual = theKWeakestRowsInMatrix.kWeakestRows(mat, k);
        assertThat(actual).isEqualTo(expected);
    }

}