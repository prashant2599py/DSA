package queue;

import queue.QueueUsingCircularArray.Queue;

public class QueueUsingLL {
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	static class Queue{
		
		static Node head = null;
		static Node tail = null;
	

		public static boolean isEmpty() {
			return head == null & tail == null;
		}
		
		
		
		//Enqueue/add
		public static void add(int data) {
			Node newNode = new Node(data);
			if(tail == null) {
				tail = head = newNode;
				return;
			}
			tail.next = newNode;
			tail = newNode;
		}
		
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			int front = head.data;
			//where there is only one node
			if(head == tail) {
				tail = null;
			}
			head = head.next;
			return front;
		}
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queeue is empty");
				return -1;
			}
			return head.data;
		}
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(5);
		System.out.println(q.remove());
		q.add(7);
		
		System.out.println(q.remove());
		q.add(8);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
		
		if(q.isEmpty()) {
			System.out.println("Queue is Empty");
		}else {
			System.out.println("Queue is not empty");
		}
	}
}
