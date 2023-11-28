package com.bridgelabs.LLStack;

public class Stack<T extends Comparable<T>> {
	private LinkedList<T> linkedList;

	public Stack() {
		linkedList = new LinkedList<>();
	}

	/*
	 * @params: None
	 * 
	 * @return : boolean (true if the stack is empty, false otherwise)
	 * 
	 * @Description: Checking if the stack is empty
	 */
	private boolean isEmpty() {
		return linkedList.getHead() == null;
	}

	/*
	 * @params: T data
	 * 
	 * @return : void
	 * 
	 * @Description: Pushing a new element onto the stack
	 */
	public void push(T data) {
		linkedList.insertAtbegin(data);
	}

	/*
	 * @params: None
	 * 
	 * @return : T (the top element without removing it)
	 * 
	 * @Description: Peeking at the top element of the stack
	 */
	public T peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return linkedList.getHead().data;
	}

	/*
	 * @params: None
	 * 
	 * @return : T (the popped element)
	 * 
	 * @Description: Popping the top element from the stack
	 */

	public T pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		}
		T poppedData = linkedList.getHead().data;
		linkedList.pop();
		return poppedData;
	}

	/*
	 * @params: None
	 * 
	 * @return : void
	 * 
	 * @Description: Displaying the elements of the stack
	 */
	public void display() {
		linkedList.display();
	}

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
