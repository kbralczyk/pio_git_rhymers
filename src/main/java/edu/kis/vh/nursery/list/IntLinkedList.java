package edu.kis.vh.nursery.list;

public class IntLinkedList {
	private static final int ERROR_VALUE = -1;
	private Node last;
	private int value;

	public void push(int val) {
		if (last == null)
			last = new Node(val);
		else {
			last.next = new Node(val);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return ERROR_VALUE;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return ERROR_VALUE;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
