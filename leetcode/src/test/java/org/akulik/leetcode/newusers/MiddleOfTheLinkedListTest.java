package org.akulik.leetcode.newusers;

import org.akulik.leetcode.newusers.data.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MiddleOfTheLinkedListTest {

    private final MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new ListNode(
                                1, new ListNode(
                                2, new ListNode(
                                3, new ListNode(
                                4, new ListNode(
                                5))))),
                        new ListNode(
                                3, new ListNode(
                                4, new ListNode(
                                5)))),
                Arguments.of(new ListNode(
                                1, new ListNode(
                                2, new ListNode(
                                3, new ListNode(
                                4, new ListNode(
                                5, new ListNode(
                                6)))))),
                        new ListNode(
                                4, new ListNode(
                                5, new ListNode(
                                6))))
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void middleNode(ListNode nodes, ListNode expected) {
        ListNode actual = middleOfTheLinkedList.middleNode(nodes);
        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

}