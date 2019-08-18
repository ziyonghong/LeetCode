package com.linklist;

class Node{
	int data;
	Node next;
	Node prev;
	public Node (int data){
		this.data=data;
		next=null;
		prev=null;
	}
}
public class CircularDeque641 {
	private Node front;
	private Node rear;
	private int capacity;
	private int size;
	/** Initialize your data structure here. Set the size of the deque to be k. */
	public CircularDeque641(int k) {
		front=null;
		rear=null;
		capacity=k;
		size=0;
	}

	private Node insert(int value){
		if(isFull()){
			return null;
		}
		Node node =new Node(value);
		if(front==null){
			node.prev=node;
			node.next=node;
			front=node;
			rear=node;
		}else{
			rear.next=node;
			node.prev=rear;
			node.next=front;
			front.prev=node;
		}
		size++;
		return node;
	}

	private boolean isFull() {
		return size==capacity;	}

	private boolean isEmpty() {
		return size==0;
	}
}
