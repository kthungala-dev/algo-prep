package com.kiran.collections.linkedlist;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> underTest = new SimpleLinkedList<>();

        underTest.addNode(5);
        underTest.addNode(10);
        underTest.addNode(15);
        underTest.addNode(2);
        underTest.addNode(7);

        underTest.printNodes(); // 5,10,15,2,7
    }
}
