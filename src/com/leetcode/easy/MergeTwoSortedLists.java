package com.leetcode.easy;
// 21


import com.leetcode.utils.ListNode;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode l1N1 = new ListNode(1);
        ListNode l1N2 = new ListNode(3);
        l1N1.next = l1N2;

        ListNode l2N1 = new ListNode(2);
        ListNode l2N2 = new ListNode(4);

        l2N1.next = l2N2;

        System.out.println(mergeTwoLists(l1N1, l2N1));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode handler = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                handler.next = l1;
                l1 = l1.next;
            } else {
                handler.next = l2;
                l2 = l2.next;
            }
            handler = handler.next;
        }

        if (l1 != null) {
            handler.next = l1;
        } else if (l2 != null) {
            handler.next = l2;
        }

        return head.next;
    }
}
