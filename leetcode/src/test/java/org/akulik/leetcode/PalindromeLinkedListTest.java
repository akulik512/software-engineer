package org.akulik.leetcode;

import org.akulik.leetcode.data.ListNode;
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
    void isPalindrome(ListNode listNodes, boolean expectedResult) {
        boolean result = palindromeLinkedList.isPalindrome(listNodes);
        assertEquals(expectedResult, result);
    }

}