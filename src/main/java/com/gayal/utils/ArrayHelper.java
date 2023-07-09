package com.gayal.utils;

public class ArrayHelper {

    public static int[] getDescSortedIntArray(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++)
            numbers[i] = size - i;

        return numbers;

    }

}
