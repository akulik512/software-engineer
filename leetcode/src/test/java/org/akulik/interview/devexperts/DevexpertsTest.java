package org.akulik.interview.devexperts;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class DevexpertsTest {

    private final Devexperts devexperts = new Devexperts();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 7, 8, 9, 10, 5, 1, 6}, 1),
                Arguments.of(new int[]{1, 2, 3, 4, 7, 8, 9, 10, 5, 6}, 0)
        );
    }

    private static Stream<Arguments> firmTestData() {
        return Stream.of(
                Arguments.of(
                        List.of(
                                new Firm(
                                        List.of(
                                                new Person("John", 35),
                                                new Person("Bob", 40))
                                ),
                                new Firm(
                                        List.of(
                                                new Person("Jill", 40),
                                                new Person("Brian", 25))
                                ),
                                new Firm(
                                        List.of(
                                                new Person("Jessy", 35),
                                                new Person("Betty", 25))
                                )
                        )
                        ,
                        Map.of(
                                "J35", List.of("John", "Jessy"),
                                "J40", List.of("Jill"),
                                "B40", List.of("Bob"),
                                "B25", List.of("Betty", "Brian")
                        )
                ));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void findM(int[] nums, int expected) {
        int result = devexperts.findM(nums);
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("testData")
    void findM_2(int[] nums, int expected) {
        int result = devexperts.findM_2(nums);
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("firmTestData")
    void groupAndFilterEmployees(List<Firm> firms, Map<String, List<String>> expected) {
        Map<String, List<String>> result = devexperts.groupAndFilterEmployees(firms);
        assertThat(result)
                .usingRecursiveComparison()
                .ignoringCollectionOrder()
                .isEqualTo(expected);
    }
}