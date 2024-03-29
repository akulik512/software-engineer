package org.akulik.lists.newusers;

import org.akulik.lists.ListNode;

// 876. Middle of the Linked List
public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}
