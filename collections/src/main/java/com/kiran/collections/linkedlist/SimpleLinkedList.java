package com.kiran.collections.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class SimpleLinkedList<T extends Comparable<T>> implements LinkedList<T> {

    private Node<T> head = null;

    @Override
    public Node<T> getHead() {
        return head;
    }

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
        if(countNodes() == 0 || head.getData().compareTo(data) > 0) {
            Node<T> next = head;
            head = new Node<T>(data);
            head.setNext(next);
        } else {
            Node<T> current = head;
            while(current.getNext() != null && current.getNext().getData().compareTo(data) < 0) {
                current = current.getNext();
            }
            Node<T> next = current.getNext();
            current.setNext(new Node<T>(data));
            current.getNext().setNext(next);
        }
    }

    @Override
    public void appendList(LinkedList<T> ll) {
        if(ll.countNodes() == 0) {
            return;
        } else {
            Node<T> current = ll.getHead();
            while(current != null) {
                addNode(current.getData());
                current = current.getNext();
            }
        }

    }

    @Override
    public List<Node<T>> frontBackSplit() {
        Node<T> l1;
        Node<T> l2;
        if(head == null) {
            l1 = null;
            l2 = null;
        } else if(head.getNext() == null) {
            l1 = head;
            l2 = null;
        } else {
            Node<T> slow = head;
            Node<T> fast = head;
            while(fast != null) {
                fast = fast.getNext();
                if(fast == null) {
                    break;
                }
                fast = fast.getNext();
                if(fast != null) {
                    slow = slow.getNext();
                }
            }
            l1 = head;
            l2 = slow.getNext();
            slow.setNext(null);
        }
        List<Node<T>> result = new ArrayList<>();
        result.add(l1);
        result.add(l2);
        return result;
    }

    @Override
    public void removeDuplicates() {
        if(head != null) {
            Node<T> current = head;
            while(current.getNext() != null) {
                if(current.getData().compareTo(current.getNext().getData()) == 0) {
                    current.setNext(current.getNext().getNext());
                } else {
                    current = current.getNext();
                }
            }
        }

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
        Node<T> reverse = null;
        if(head != null) {
            do{
                T data = popElement();
                Node<T> current = reverse;
                reverse = new Node<T>(data);
                reverse.setNext(current);
            } while(head != null);
            head = reverse;
        }
    }
}
