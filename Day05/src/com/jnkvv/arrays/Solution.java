package com.jnkvv.arrays;

class Solution {
    public ListNode swapPairs(ListNode head) {

        int n = length(head);

        if (n == 0 || n == 1)
            return head;
        else {
            ListNode fast = head.next.next;
            ListNode slow = head.next;
            ListNode curr = head;
            ListNode prev;
            head = slow;
            curr = fast;
            head.next = curr;
            curr.next = fast;
            while (fast.next != null || fast.next.next != null) {
                fast = fast.next.next;
                prev = slow.next;
                curr = slow;
                slow = prev.next;
                slow.next = fast;
                curr.next = slow;
                prev.next = curr;
                System.out.println("fast = "+fast.val);
                System.out.println("prev = "+prev.val);
                System.out.println("slow = "+slow.val);
                System.out.println("curr = "+curr.val);
            }
        }
        return head;

    }

    public static int length(ListNode head) {
        int length = 0;
        ListNode current = head;

        while (current != null) {
            length++;
            current = current.next;
        }

        return length;
    }
}
