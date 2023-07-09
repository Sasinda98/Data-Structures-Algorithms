package com.gayal.data.structures.LinkedList;

import java.util.Objects;

public class LinkedList<T> {

    private Node head;
    private Node tail;

    /*
     * Add element to end of the list.
     * */
    public void add(T value) {

        Node node = new Node();
        node.data = value;

        if (Objects.isNull(head) && Objects.isNull(tail)) {
            //SCENARIO 1: When empty linked list, set head == tail.
            head = node;
            tail = node;
        } else if (Objects.isNull(head.next)) {
            //SCENARIO 2: When inserting to 1 node linked list, separate out head and tail.
            node.prev = head;
            head.next = node;
            tail = node;
        } else {
            //SCENARIO 3: When inserting to > 2 node linked list, just add to tail.
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

    }

    /*
     * Add element to defined index in the linked list.
     * */
    public void add(int index, T value) {

        Node node = new Node();
        node.data = value;

        Node current = head;
        Node element = null;

        int currentIndex = 0;

        while (Objects.nonNull(current)) {

            if (currentIndex == index) {
                element = current;
                break;
            }

            current = current.next;
            currentIndex++;
        }

        if (Objects.isNull(element))
            throw new IndexOutOfBoundsException("No such index found in the linked list, index out of bounds.");

        if (Objects.isNull(element.prev)) {
            //SCENARIO 1: Element is head
            node.next = element;
            element.prev = node;
            head = node;
        } else if (Objects.isNull(element.next)) {
            //SCENARIO 2: Element is tail
            node.prev = element;
            element.next = node;
            tail = node;
        } else {
            //SCENARIO 3: Element has neighbours
            Node prev = element.prev;

            node.next = element;
            prev.next = node;
            node.prev = prev;
            element.prev = node;
        }

    }

    public void printFromHead() {

        Node current = head;
        StringBuilder contents = new StringBuilder();

        while (Objects.nonNull(current)) {
            contents.append(current.data.toString());
            contents.append(" <-> ");
            current = current.next;
        }
        String tailTrimmed = contents.substring(0, contents.length() - 5);
        System.out.println("[ " + tailTrimmed + " ]");

    }

    public void printFromTail() {

        Node current = tail;
        StringBuilder contents = new StringBuilder();

        while (Objects.nonNull(current)) {
            contents.append(current.data.toString());
            contents.append(" <-> ");
            current = current.prev;
        }

        String tailTrimmed = contents.substring(0, contents.length() - 5);
        System.out.println("[ " + tailTrimmed + " ]");

    }

    private class Node {

        public Node next;
        public T data;
        public Node prev;

    }

}
