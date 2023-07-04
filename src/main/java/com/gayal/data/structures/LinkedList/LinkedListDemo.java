package com.gayal.data.structures.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("F");

        linkedList.add(0, "x");



        linkedList.printFromHead();
        linkedList.printFromTail();
    }

}
