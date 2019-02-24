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
        ListNode temp_head(0);  //������ʱͷ�ڵ�temp_head
        ListNode *ptr = &temp_head; //ʹ��preָ��ָ��temp_head
        while(l1&&l2){  //l1��l2����ʱ�������ǽ��бȽ�
            if(l1->val < l2->val){   //���l1��Ӧ�Ľڵ�С��l2��Ӧ�Ľڵ�
                ptr->next = l1;   //��ptr���С�Ľڵ��������
                l1 = l1->next;
            }
            else{
                ptr->next = l2;
                l2 = l2->next;
            }
            ptr = ptr->next;  //ptrָ�������ӵĽڵ�
        }
        if(l1){  //���l1��ʣ��
            ptr->next = l1;   //��l1�ӵ�ptr��
        }
        if(l2){
            ptr->next = l2;  //��l2�ӵ�ptr��
        }
        return temp_head.next;
    }
};
*/