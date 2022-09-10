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

	public void peek() {
		System.out.println("Top most element : " + linkedlist.head.data);
		System.out.println();
	}

	public void pop() {
		linkedlist.pop();
	}

	public void printStack() {
		linkedlist.print();
		System.out.println();
	}

}
