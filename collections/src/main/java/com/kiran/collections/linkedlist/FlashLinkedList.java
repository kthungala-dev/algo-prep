package com.kiran.collections.linkedlist;

public class FlashLinkedList<T extends Comparable<T>> implements PracticeLinkedList<T>, Cloneable {

    private Node<T> head = null;
    private int count = 0;

    public FlashLinkedList() {
    }

    public void printElements() {
        if (head == null) {
            System.out.println("its empty");
        } else {
            System.out.println("Elements are:");
            Node<T> h = head;
            while (h != null) {
                System.out.println(h.getData());
                h = h.getNext();
            }
        }
    }

    public void addElementAtEnd(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            this.head = node;
        } else {
            Node<T> h = head;
            while (h.getNext() != null) {
                h = h.getNext();
            }
            h.setNext(node);
        }
        count++;
        System.out.println("Element Added");
    }

    public void addElementAtStart(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            Node<T> h = head;
            head = node;
            head.setNext(h);
        }
        count++;
        System.out.println("Element Added");
    }

    public boolean findElement(T data) {
        if (head != null) {
            Node<T> h = head;
            while (h != null) {
                if (data.equals(h.getData())) {
                    return true;
                }
                h = h.getNext();
            }

        }
        return false;
    }

    // Delete first element
    public T pop() {
        if (head == null) {
            System.out.println("List empty!");
            return null;
        } else {
            Node<T> h = head;
            head = head.getNext();
            System.out.println("First element deleted!");
            count--;
            return h.getData();
        }
    }

    public void deleteElement(T data) {
        Node<T> h = head;
        if (head == null) {
            System.out.println("List empty!");
        } else if (h.getData().equals(data)) {
            pop();
        } else {
            h = head;
            while (h.getNext() != null) {
                if (h.getNext().getData().equals(data)) {
                    h.setNext(h.getNext().getNext());
                    count--;
                    System.out.println("Element deleted");
                    return;
                } else {
                    h = h.getNext();
                }
            }
        }
    }

    public int size() {
        return count;
    }

}