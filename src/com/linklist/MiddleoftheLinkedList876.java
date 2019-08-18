package com.linklist;
 class ListNode {
	     int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
public class MiddleoftheLinkedList876 {
	  public ListNode middleNode(ListNode head) {
		ListNode slow=head;
		ListNode fast=head;
		while(fast!=null&&fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
		}
		  return slow;
	        
	    }
}
