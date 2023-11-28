package com.bridgelabs.LLStack;

public class Stack<T extends Comparable<T>> {
	private LinkedList<T> linkedList;

	public Stack() {
		linkedList = new LinkedList<>();
	}

	private boolean isEmpty() {
		return linkedList.getHead() == null;
	}

	public void push(T data) {
		linkedList.insertAtbegin(data);
	}
	
	public void display() {
		linkedList.display();
	}

	public static void main(String[] args) {
		System.out.println("Stack Using Linked List");

		Stack<Integer> stack = new Stack<>();

		// Push elements onto the stack
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.display();
	}

}
