package org.akulik.leetcode.newusers;

import org.akulik.leetcode.ListNode;

// 234. Palindrome Linked List (easy)
// Time: O(n) - the time depends only on the count of input data values
// Space: O(1) - memory is used only to create variables and the number of these variables doesn't
// depend on the size of the list
public class PalindromeLinkedList {

    public boolean isPalindrome(final ListNode head) {
        if (head == null) return true;

//        1. Find a secondList. The secondList starts from the head of the second list.
        ListNode secondList = getMiddle(head);
//        2. Expand the links of the secondList in the opposite direction to go from the right to the left.
//        3. We got a list that goes on both sides and refers to the middle element.
//        4. The middle element refers to null.
        ListNode secondHead = reverse(secondList);

//        5. In order not to lose connection with the new head, we will create two new links.
        ListNode pointerLeft = head;
        ListNode pointerRight = secondHead;

//        6. Now we need to go through the loop until we meet the null.
        while (pointerRight != null) {
            if (pointerLeft.val != pointerRight.val) {
//                6.1 We restore the order of links in the correct order to the palindrome check method doesn't change the list.
                reverse(secondHead);
                return false;
            }
            pointerLeft = pointerLeft.next;
            pointerRight = pointerRight.next;
        }

        reverse(secondHead);
        return true;
    }

    private ListNode getMiddle(ListNode head) {
        ListNode slow = head;
//        1.1 To avoid problems in the case of a list containing two elements.
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.next;
    }

    // 2.1 Returns the head of the second list, i.e. what is now the tail.
    private ListNode reverse(ListNode middle) {
//        2.2 The previous will be the end of the second list.
        ListNode previous = null;
        ListNode current = middle;
        while (current != null) {
            ListNode temp = current.next;
            current.next = previous;

            previous = current;
            current = temp;
        }
        return previous;
    }

}
