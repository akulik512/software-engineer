package org.akulik.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class RichestCustomerWealthTest {

    private final RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[][]{
                        {1, 2, 3},
                        {3, 2, 1}
                }, 6),
                Arguments.of(new int[][]{
                        {1, 5},
                        {7, 3},
                        {3, 5}
                }, 10),
                Arguments.of(new int[][]{
                        {2, 8, 7},
                        {7, 1, 3},
                        {1, 9, 5}
                }, 17)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void maximumWealth(int[][] accounts, int expectedResult) {
        int result = richestCustomerWealth.maximumWealth(accounts);
        assertThat(result).isEqualTo(expectedResult);
    }

}