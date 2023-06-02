package com.akulik.usecase;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BatchingTest {

    private final Batching batching = new Batching();

    @Test
    void batch() {
        final List<Integer> testData = List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33);

        final List<List<Integer>> batches = batching.batch(testData, 10);

        final List<List<Integer>> expectedResult = List.of(
                List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                List.of(11, 12, 13, 14, 15, 16, 17, 18, 19, 20),
                List.of(21, 22, 23, 24, 25, 26, 27, 28, 29, 30),
                List.of(31, 32, 33));
        assertThat(batches).isEqualTo(expectedResult);
    }
}