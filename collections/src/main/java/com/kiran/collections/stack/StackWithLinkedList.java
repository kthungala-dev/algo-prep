package com.kiran.collections.stack;

import com.kiran.collections.linkedlist.Node;

public class StackWithLinkedList<T extends Comparable<T>> implements Stack<T> {

    private Node<T> head;
    private final int capacity;
    private int size;

    public StackWithLinkedList(int capacity) {
    	this.capacity = capacity; 
    }

    @Override
    public void push(T data) {
    	if(isFull()) {
    		throw new IllegalStateException("Stack is full");
    	}
    	Node<T> next = new Node<T>(data);
    	if(head == null) {
    		head = next;
    	} else {
    		next.setNext(head);
    		head = next;
    	}
    	size++;
    }

    @Override
    public T pop() {
    	if(isEmpty()) {
    		throw new IllegalStateException("Stack is empty");
    	}
    	T data = head.getData();
    	head = head.getNext();
        size--;
        return data;
    }

    @Override
    public T peek() {
		if(isEmpty()) {
    		throw new IllegalStateException("Stack is empty");
    	}
        return head.getData();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return capacity == size;
    }

    @Override
    public int size() {
        return size;
    }

}
