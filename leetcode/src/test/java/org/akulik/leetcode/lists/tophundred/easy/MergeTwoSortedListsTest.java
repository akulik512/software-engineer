package org.akulik.leetcode.lists.tophundred.easy;

import org.akulik.leetcode.lists.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new ListNode(
                                1, new ListNode(
                                2, new ListNode(
                                4))
                        ),
                        new ListNode(
                                1, new ListNode(
                                3, new ListNode(
                                4))),
                        new ListNode(
                                1, new ListNode(
                                1, new ListNode(
                                2, new ListNode(
                                3, new ListNode(
                                4, new ListNode(
                                4))))))
                )
        );
    }

    private static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(
                        new ListNode(),
                        new ListNode(),
                        new ListNode()
                ),
                Arguments.of(
                        new ListNode(),
                        new ListNode(0),
                        new ListNode(0)
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void mergeTwoLists(ListNode list1, ListNode list2, ListNode expected) {
        ListNode result = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertThat(result).usingRecursiveComparison().isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("edgeCases")
    void mergeTwoListsEdgeCases(ListNode list1, ListNode list2, ListNode expected) {
        ListNode result = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertThat(result).usingRecursiveComparison().isEqualTo(expected);
    }

}