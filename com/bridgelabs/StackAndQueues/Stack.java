package com.bridgelabs.StackAndQueues;

public class Stack<T extends Comparable<T>> {
	private LinkedList<T> linkedList;

	public Stack() {
		linkedList = new LinkedList<>();
	}

	/*
	 * @Description: Checking if the stack is empty
	 * 
	 * @params: None
	 * 
	 * @return : boolean (true if the stack is empty, false otherwise)
	 */
	private boolean isEmpty() {
		return linkedList.getHead() == null;
	}

	/*
	 * @Description: Pushing a new element onto the stack
	 * 
	 * @params: T data
	 * 
	 * @return : void
	 */
	public void push(T data) {
		linkedList.insertAtbegin(data);
	}

	/*
	 * @Description: Peeking at the top element of the stack
	 * 
	 * @params: None
	 * 
	 * @return : T (the top element without removing it)
	 */
	public T peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		}
		return linkedList.getHead().data;
	}

	/*
	 * @Description: Popping the top element from the stack
	 * 
	 * @params: None
	 * 
	 * @return : T (the popped element)
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
	 * @Description: Displaying the elements of the stack
	 * 
	 * @params: None
	 * 
	 * @return : void
	 */
	public void display() {
		linkedList.display();
	}

}
