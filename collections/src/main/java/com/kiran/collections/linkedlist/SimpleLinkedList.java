package com.kiran.collections.linkedlist;

import java.util.List;

public class SimpleLinkedList<T extends Comparable<T>> implements LinkedList<T> {

    private Node<T> head = null;

    @Override
    public void addNode(T data) {

        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new Node<>(data));
        }
    }

    @Override
    public void printNodes() {
        if (head == null) {
            System.out.println("There is no node in the linked list");
        } else {
            Node<T> currentNode = head;
            int i = 1;
            while (currentNode != null) {
                System.out.println(
                    "Node<T> number " + i + ", the value it stores is " + currentNode.getData());
                currentNode = currentNode.getNext();
                i++;
            }
        }
    }

    @Override
    public int countNodes() {
        if(head != null) {
            int count = 0;
            Node<T> current = head;
            while (current != null) {
                count++;
                current = current.getNext();
            }
            return count;
        }
        return 0;
    }

    @Override
    public T popElement() {
        if(head != null) {
            T data = head.getData();
            head = head.getNext();
            return data;
        }
        return null;
    }

    @Override
    public void deleteLinkedList() {
        head = null;
    }

    @Override
    public void insertNth(int n, T data) {
        int count = countNodes();
        if(n < 0 || count < n) {
            return;
        }
        Node<T> newNode = new Node<T>(data);
        if(n == 0) {
            Node<T> nextNode = head;
            head = newNode;
            newNode.setNext(nextNode);
        } else {
            Node<T> currentNode = head;
            int i = 1;
            while (i < n - 1) {
                currentNode = currentNode.getNext();
                i++;
            }
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
        }
    }

    @Override
    public void insertSorted(T data) {
    }

    @Override
    public void appendList(LinkedList<T> ll) {

    }

    @Override
    public List<Node<T>> frontBackSplit() {
        return null;
    }

    @Override
    public void removeDuplicates() {

    }

    @Override
    public void changeHead(LinkedList<T> destinationList) {

    }

    @Override
    public LinkedList<T> sortedMergeList(LinkedList<T> otherList) {
        return null;
    }

    @Override
    public void reverseList() {

    }
}
