package com.bridgelabs.StackAndQueues;

public class Queue<T extends Comparable<T>> {

	private LinkedList<T> linkedList;

	public Queue() {

		linkedList = new LinkedList<>();
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
	 * @params: None
	 * 
	 * @return : void
	 * 
	 * @Description: Displaying the elements of the queue
	 */
	public void display() {
		linkedList.display();
	}

	public static void main(String[] args) {
		System.out.println("Queue Using Linked List");

		Queue<Integer> queue = new Queue<>();

		// Enqueue elements into the queue
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);

		// Display the queue
		System.out.println("Queue elements:");
		queue.display();
	}
}
