package com.kiran.algo.linkedlist;

public class Node<T extends Comparable<T>> {

    private T data;
    private Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }

    public T getData() {
        return this.data;
    }
}
