package com.kiran.collections.linkedlist;

import java.util.List;

import javax.print.attribute.standard.PresentationDirection;

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


        underTest.insertSorted(20);
        underTest.insertSorted(1);
        underTest.insertSorted(30);
        underTest.insertSorted(15);
        underTest.printNodes();

        System.out.println("Append list order");
        // Create new list1
        LinkedList<Integer> l1 = new SimpleLinkedList<>();
        l1.addNode(10);l1.addNode(20);l1.addNode(30);
        // Create new list2
        LinkedList<Integer> l2 = new SimpleLinkedList<>();
        l2.addNode(40);l2.addNode(50);

        l1.appendList(l2);
        l1.printNodes();

        System.out.println("Append list order - set 2");
        // Create new list3
        LinkedList<Integer> l3 = new SimpleLinkedList<>();
        // Create new list4
        LinkedList<Integer> l4 = new SimpleLinkedList<>();
        l4.addNode(40);l4.addNode(50);

        l3.appendList(l4);
        l3.printNodes();

        System.out.println("frontBackSplit - 1");
        LinkedList<Integer> master = new SimpleLinkedList<>();
        master.addNode(1);master.addNode(2);master.addNode(3);master.addNode(4);master.addNode(5);
        List<Node<Integer>> nodes = master.frontBackSplit();
        System.out.println(nodes.get(0));
        System.out.println(nodes.get(1));

        System.out.println("duplicates - 1");
        LinkedList<Integer> duplicateList = new SimpleLinkedList<>();
        duplicateList.addNode(1);duplicateList.addNode(1);duplicateList.addNode(2);duplicateList.addNode(2);duplicateList.addNode(2);duplicateList.addNode(3);
        duplicateList.removeDuplicates();
        duplicateList.printNodes();

        System.out.println("Reverse1"); // 1, 2, 3
        duplicateList.reverseList();
        duplicateList.printNodes();

        System.out.println("Reverse2");
        LinkedList<Integer> reverse = new SimpleLinkedList<>();
        reverse.reverseList();
        reverse.printNodes();

        System.out.println("Reverse3");
        LinkedList<Integer> reverse1 = new SimpleLinkedList<>();
        reverse1.addNode(1);
        reverse1.reverseList();
        reverse1.printNodes();
    }
}
