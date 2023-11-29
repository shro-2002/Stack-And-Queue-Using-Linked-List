package com.bridgelabs.StackAndQueues;

public class Queue_Main {
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

		// Dequeue elements from queue
		System.out.println();
		System.out.println("Dequeued items: ");
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

	}

}
