package com.Stack;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to stack");

		Node node1 = new Node(70);
		Node node2 = new Node(30);
		Node node3 = new Node(56);

		Stack stack = new Stack();
		stack.push(node1);
		stack.push(node2);
		stack.push(node3);
		stack.printStack();
	}

}
