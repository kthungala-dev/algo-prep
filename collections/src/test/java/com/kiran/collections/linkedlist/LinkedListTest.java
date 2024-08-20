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

        System.out.println(underTest.countNodes()); // 5

        underTest.popElement();
        underTest.popElement();

        underTest.printNodes(); // 15,2,7

        underTest.popElement();
        underTest.popElement();
        underTest.popElement();
        underTest.popElement();
        underTest.popElement();
        underTest.popElement();

        underTest.printNodes(); //There is no node in the linked list

        underTest.addNode(1);
        underTest.addNode(2);
        underTest.deleteLinkedList();
        underTest.printNodes(); //There is no node in the linked list

        System.out.println("Insert nth");
        underTest.addNode(5);
        underTest.addNode(10);
        underTest.addNode(15);
        underTest.addNode(2);
        underTest.addNode(7);

        underTest.insertNth(3, 50);
        underTest.printNodes(); // 5,10,50,15,2,7

        System.out.println("Insert nth 1");
        underTest.insertNth(0, 100);
        underTest.printNodes(); // 100,5,10,50,15,2,7

        System.out.println("Inserted sorted order");
        underTest.deleteLinkedList();

        underTest.addNode(5);
        underTest.addNode(10);
        underTest.addNode(20);
        underTest.addNode(25);

        underTest.insertSorted(12);
        underTest.printNodes();
    }
}
