package com.gayal.data.structures.dynamic.array;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray(4);
        dynamicArray.put("A");
        dynamicArray.put("B");
        dynamicArray.put("C");
        dynamicArray.put("D");
        dynamicArray.put("E");
        dynamicArray.put("F");
        dynamicArray.put("G");
        dynamicArray.put("H");
        dynamicArray.put("I");
        dynamicArray.put("J");
        dynamicArray.put("K");

        dynamicArray.removeAt(5);
        dynamicArray.insertAt(5, "F");

        dynamicArray.removeAt(1);
        dynamicArray.insertAt(1, "B");

        dynamicArray.removeAt(dynamicArray.size - 1);

        dynamicArray.print();

    }

}
