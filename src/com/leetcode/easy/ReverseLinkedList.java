package com.leetcode.easy;
// 206

import com.leetcode.utils.ListNode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        System.out.println(l1);
        System.out.println(reverseList(l1));
        System.out.println(reverseListInt(l4, null));
    }


    public static ListNode reverseList(ListNode head) {
        ListNode back = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = back;
            back = head;
            head = next;
        }
        return back;

    }


    private static ListNode reverseListInt(ListNode head, ListNode newHead) {
        if (head == null) return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverseListInt(next, head);
    }
}
