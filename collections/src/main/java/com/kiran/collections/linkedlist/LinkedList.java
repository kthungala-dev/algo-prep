package com.kiran.collections.linkedlist;

import java.util.List;

public interface LinkedList<T extends Comparable<T>> {

    /**
     * For operational convience returning head. I know its bad idea.
     */
    Node<T> getHead();

    /**
     * Append a new node to the end of the linked list.
     */
    void addNode(T data);

    /**
     * Print all the nodes in the linked list.
     */
    void printNodes();

    /**
     * Count the number of nodes in the linked list.
     */
    int countNodes();

    /**
     * Return the first element in the linked list.
     */
    T popElement();

    /**
     * Delete all the elements in the linked list.
     */
    void deleteLinkedList();

    /**
     * Insert at the nth position in the list. Return if the number of nodes is
     * less than n.
     */
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
