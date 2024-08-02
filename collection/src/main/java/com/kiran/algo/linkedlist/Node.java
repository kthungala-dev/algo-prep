package com.kiran.algo.linkedlist;

public class Node<T extends Comparable<T>> {

    private final T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public T getData() {
        return this.data;
    }
}
