package org.akulik.dsa.datastructure;

import org.akulik.leetcode.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesFromSortedListTest {

    RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new ListNode(
                                1, new ListNode(
                                1, new ListNode(
                                2))
                        ),
                        new ListNode(
                                1, new ListNode(
                                2))
                ),
                Arguments.of(
                        new ListNode(
                                1, new ListNode(
                                1, new ListNode(
                                2, new ListNode(
                                3, new ListNode(
                                3))))),
                        new ListNode(
                                1, new ListNode(
                                2, new ListNode(
                                3)))
                ),
                Arguments.of(
                        new ListNode(
                                1, new ListNode(
                                2, new ListNode(
                                3))
                        ),
                        new ListNode(
                                1, new ListNode(
                                2, new ListNode(
                                3))
                        )
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void deleteDuplicates(ListNode head, ListNode expected) {
        ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(head);
        assertThat(result).usingRecursiveComparison().isEqualTo(expected);
    }
}