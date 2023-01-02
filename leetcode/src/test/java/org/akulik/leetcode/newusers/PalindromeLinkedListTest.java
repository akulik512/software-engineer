package org.akulik.leetcode.newusers;

import org.akulik.leetcode.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeLinkedListTest {

    private final PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new ListNode(
                        1, new ListNode(
                        2, new ListNode(
                        3, new ListNode(
                        2, new ListNode(
                        1))))), true),
                Arguments.of(new ListNode(
                        1, new ListNode(
                        2, new ListNode(
                        3, new ListNode(
                        4, new ListNode(
                        5))))), false)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void isPalindrome(ListNode nodes, boolean expected) {
        boolean actual = palindromeLinkedList.isPalindrome(nodes);
        assertEquals(expected, actual);
    }

}