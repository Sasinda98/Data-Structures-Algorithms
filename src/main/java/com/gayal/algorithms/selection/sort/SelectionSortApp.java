package com.gayal.algorithms.selection.sort;

import static com.gayal.algorithms.selection.sort.SelectionSort.sort;

public class SelectionSortApp {

    private static final int ARRAY_SIZE = 20;

    public static void main(String[] args) {

        int[] numArray = getDescSortedArray();
        print(numArray);

        int[] sorted = sort(numArray);
        print(sorted);

    }

    public static int[] getDescSortedArray() {
        int[] numbers = new int[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++)
            numbers[i] = ARRAY_SIZE - i;

        return numbers;

    }

    public static void print(int[] array) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int j : array) stringBuilder.append(j).append(", ");
        String content = stringBuilder.substring(0, stringBuilder.length() - 2);
        System.out.printf("[ %s ]%n", content);

    }

}
