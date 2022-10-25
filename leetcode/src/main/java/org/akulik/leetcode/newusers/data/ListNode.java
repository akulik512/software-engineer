package org.akulik.leetcode.newusers.data;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(final int val) {
        this.val = val;
    }

    public ListNode(final int val, final ListNode nextNode) {
        this.val = val;
        this.next = nextNode;
    }

}
