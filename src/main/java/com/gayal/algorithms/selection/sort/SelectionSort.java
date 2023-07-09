package com.gayal.algorithms.selection.sort;

public class SelectionSort {

    public static int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int minIndex = i;

            for (int j = i; j < array.length; j++)
                if(array[minIndex] > array[j])
                    minIndex = j;

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

        }

        return array;

    }

}
