package com.kiran.collections.stack;

public interface Stack<T extends Comparable<T>> {

	void push(T data);
	T pop();
	T peek();
	
	boolean isEmpty();
	boolean isFull();
	int size();

}
