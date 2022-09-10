package com.Stack;

public class Stack {
	LinkedList linkedlist;
	
	public Stack() {
		this.linkedlist = new LinkedList();
	}
	
	public Node push(Node node) {
		linkedlist.add(node);
		return node;
	}
	
	public void printStack() {
		linkedlist.print();
	}

}
