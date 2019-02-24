package com.linklist;

import java.util.Random;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


public class LinkedListRandomNode382 {
	ListNode head;
	Random random;

	/**
	 * @param head
	 *            The linked list's head. Note that the head is guaranteed to be
	 *            not null, so it contains at least one node.
	 */
	public LinkedListRandomNode382(ListNode head) {
		this.head = head;
		random = new Random();
	}

	/** Returns a random node's value. */
	public int getRandom() {
		ListNode c = head;
		int r = c.val;
		for (int i = 1; c.next != null; i++) {
			c = c.next;
			if (random.nextInt(i + 1) == i)
				r = c.val;
		}
		return r;
	}

}
/**
 * Your Solution object will be instantiated and called as such: Solution obj =
 * new Solution(head); int param_1 = obj.getRandom();
 */
