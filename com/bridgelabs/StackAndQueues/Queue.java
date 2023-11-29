package com.bridgelabs.StackAndQueues;

public class Queue<T extends Comparable<T>> {

	private LinkedList<T> linkedList;

	public Queue() {

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
	 * @Description: Enqueue operation (appending to the end of the queue)
	 */
	public void enqueue(T data) {
		linkedList.insertAtEnd(data);
	}

	/*
	 * @params: T data
	 * 
	 * @return : void
	 * 
	 * @Description: Dequeue operation (removing element from front of the queue)
	 */
	public T dequeue() {
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
	 * @Description: Displaying the elements of the queue
	 */
	public void display() {
		linkedList.display();
	}

}
