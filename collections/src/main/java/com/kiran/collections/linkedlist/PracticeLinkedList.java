package com.kiran.collections.linkedlist;

public interface PracticeLinkedList<T extends Comparable<T>> {

    void printElements();

    void addElementAtEnd(T data);

    void addElementAtStart(T data);

    boolean findElement(T data);

    // Delete first element
    T pop();

    void deleteElement(T data);

    int size();
}
