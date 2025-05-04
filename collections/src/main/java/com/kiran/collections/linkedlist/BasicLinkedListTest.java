package com.kiran.collections.linkedlist;

public class BasicLinkedListTest {
    public static void main(String[] args) {
        PracticeLinkedList<Integer> list = new FlashLinkedList<>();
        list.addElementAtEnd(10);
        list.addElementAtEnd(15);
        list.printElements();
        list.addElementAtStart(5);
        list.addElementAtStart(20);
        System.out.println("Size: " + list.size());
        list.printElements();
        System.out.println(list.findElement(15));
        System.out.println(list.findElement(150));
        System.out.println(list.pop());
        System.out.println("Size: " + list.size());
        list.printElements();
        System.out.println(list.pop());
        list.addElementAtEnd(30);
        list.addElementAtEnd(40);
        list.addElementAtEnd(50);
        list.addElementAtEnd(60);
        list.addElementAtEnd(70);
        System.out.println("Size: " + list.size());
        list.printElements();
        list.deleteElement(50);
        System.out.println("Size: " + list.size());
        list.printElements();
        list.deleteElement(10);
        System.out.println("Size: " + list.size());
        list.printElements();
        list.deleteElement(70);
        System.out.println("Size: " + list.size());
        list.printElements();
    }
}
