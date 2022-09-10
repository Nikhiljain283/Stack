package com.Stack;

public class LinkedList {

	Node head;
	Node tail;

	Node node = new Node();

	public void simpleLinkedList() {
		Node node1 = new Node(56);
		Node node2 = new Node(30);
		Node node3 = new Node(70);

		node1.setNext(node2);
		node2.setNext(node3);

	}

	public Node add(Node node) {
		if (this.tail == null) {
			this.tail = node;
		}
		if (this.head == null) {
			this.head = node;
		} else {
			Node tempNode = this.head;
			this.head = node;
			this.head.setNext(tempNode);
		}
		return node;
	}
	
	public Node pop() {
		Node tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	public void print() {
		if (head != null) {
			System.out.println(head.data);
		}
		if (head.next != null) {
			System.out.println(head.next.data);
		}
		if (head.next.next != null) {
			System.out.println(head.next.next.data);
		}
	}
}
