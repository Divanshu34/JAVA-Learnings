package com.jnkvv.arrays;

// Definition for singly-linked list.	
public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	void display (ListNode head) {
//		int n = length(head);
		ListNode trav = head;
		while(trav != null) {
			System.out.println(trav.val);
			trav = trav.next;
		}
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
