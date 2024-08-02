package com.kiran.collections.linkedlist;

import java.util.List;

public interface LinkedList<T extends Comparable<T>> {

    void addNode(T data);

    void printNodes();

    int countNodes();

    T popElement();

    void deleteLinkedList();

    void insertNth(int n, T data);

    /**
     * Insert the data into the correct position in a sorted list. Assume
     * that the list is sorted in ascending order.
     */
    void insertSorted(T data);

    /**
     * Append the nodes of the other list to the end of the curren list.
     */
    void appendList(LinkedList<T> ll);

    /**
     * Split a linked list into 2 equal parts. If there are an odd number of
     * elements, the extra element should be in the first list.
     */
    List<Node<T>> frontBackSplit();

    /**
     * Remove duplicates in a sorted list.
     */
    void removeDuplicates();

    /**
     * Move the head element or the first element from this list to
     * the destination linked list as the destination's new head node.
     */
    void changeHead(LinkedList<T> destinationList);

    /**
     * Create a new sorted list which is the merged from two original sorted lists.
     * Assume the lists are sorted in ascending order.
     */
    LinkedList<T> sortedMergeList(LinkedList<T> otherList);

    /**
     * Reverse all the nodes in the linked list so that the last node
     * becomes the first node.
     */
    void reverseList();
}
