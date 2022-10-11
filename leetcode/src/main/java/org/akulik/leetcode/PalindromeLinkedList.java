package org.akulik.leetcode;

import org.akulik.leetcode.data.ListNode;

//234. Palindrome Linked List (easy)
public class PalindromeLinkedList {

    public boolean isPalindrome(final ListNode head) {
        if (head == null) return true;

        ListNode secondHalf = getMiddle(head);
        ListNode secondHead = reverse(secondHalf);

        ListNode leftHead = head;
        ListNode rightHead = secondHead;

        while (rightHead != null) {
            if (leftHead.val != rightHead.val) {
                reverse(secondHead);
                return false;
            }
            leftHead = leftHead.next;
            rightHead = rightHead.next;
        }

        reverse(secondHead);
        return true;
    }

    private ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.next;
    }

    private ListNode reverse(ListNode mid) {
        ListNode previous = null;
        ListNode current = mid;
        while (current != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }

}
