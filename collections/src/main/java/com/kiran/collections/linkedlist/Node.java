package com.kiran.collections.linkedlist;

/**
 * Test Comment
 * @param <T>
 */
public class Node<T extends Comparable<T>> {
	
	private final T data;
	private Node<T> next;

	public Node(T data) {
		this.data = data;
		setNext(null);
	}

	public T getData() {
		return data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}