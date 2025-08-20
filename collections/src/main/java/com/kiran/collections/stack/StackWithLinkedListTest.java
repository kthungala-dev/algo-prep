package com.kiran.collections.stack;

public class StackWithLinkedListTest {
    public static void main(String[] args) {
        StackWithLinkedList<Integer> underTest = new StackWithLinkedList<Integer>(5);
        underTest.push(1);
        underTest.push(2);
        underTest.push(3);
        underTest.push(4);
        underTest.push(5);
        System.out.println(underTest.isFull()); // true
        try {
            underTest.push(5);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(underTest.peek()); // 5
        System.out.println(underTest.pop()); // 5
        System.out.println(underTest.pop()); // 4
        System.out.println(underTest.pop()); // 3
        System.out.println(underTest.pop()); // 2
        System.out.println(underTest.pop()); // 1

        System.out.println(underTest.isEmpty()); // true

        try{
            System.out.println(underTest.pop());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
