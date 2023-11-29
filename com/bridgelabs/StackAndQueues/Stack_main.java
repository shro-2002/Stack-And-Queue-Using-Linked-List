package com.bridgelabs.StackAndQueues;

public class Stack_main {

	public static void main(String[] args) {
		System.out.println("Stack Using Linked List");

		Stack<Integer> stack = new Stack<>();

		// Push elements onto the stack
		stack.push(70);
		stack.push(30);
		stack.push(50);
		stack.display();

		// Top element in Stack
		System.out.println();
		System.out.println("Top Element: " + stack.peek());

		// Pop elements out of stack
		System.out.println();
		System.out.print("Popped item: ");
		System.out.println(stack.pop());

		// Top element in Stack
		System.out.println();
		System.out.println("Top Element: " + stack.peek());

		stack.display();

	}

}
