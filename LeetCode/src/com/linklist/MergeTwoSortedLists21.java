package com.linklist;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */



public class MergeTwoSortedLists21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}

	}

}
/*
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        ListNode temp_head(0);  //设置临时头节点temp_head
        ListNode *ptr = &temp_head; //使用pre指针指向temp_head
        while(l1&&l2){  //l1和l2不空时，对它们进行比较
            if(l1->val < l2->val){   //如果l1对应的节点小于l2对应的节点
                ptr->next = l1;   //将ptr与较小的节点进行连接
                l1 = l1->next;
            }
            else{
                ptr->next = l2;
                l2 = l2->next;
            }
            ptr = ptr->next;  //ptr指向新连接的节点
        }
        if(l1){  //如果l1有剩余
            ptr->next = l1;   //将l1接到ptr后
        }
        if(l2){
            ptr->next = l2;  //将l2接到ptr后
        }
        return temp_head.next;
    }
};
*/