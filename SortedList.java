//import OurLinkedList.Node;

public class SortedList<E extends Comparable<E>> {

	private int size;
	private Node front;

	private class Node {
		private E data;
		private Node next;

		public Node() {
			data = null;
			next = null;
		}

		public Node(E objectReference) {
			data = objectReference;
			next = null;
		}

		public Node(E objectReference, Node nextReference) {
			data = objectReference;
			next = nextReference;
		}
	}

	// External reference to find
	// the first element in this list

	// Number of elements in this list

	public SortedList() {
		front = null;
		size = 0;
	}

	public void insertInOrder(E element) {
		Node node = new Node(element);
		size++;
		if (front == null) {
			front = node;
			node.next = null;
		} 
		else if (node.data.compareTo(front.data) < 0) {
			node.next = front;
			front = node;
		}
		else {
			Node temp = front;
			while (temp.next != null && node.data.compareTo(temp.next.data) >= 0) {
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;
		}
	}

	public int size() {
		return size;
	}
	
	public void printList() {
		Node temp = front;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void remove(E element) {
		size--;
		if (front.data.compareTo(element) == 0) {
			front = front.next;
		}
		else {
			Node temp = front;
			while (temp.next.data.compareTo(element) != 0) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}
}