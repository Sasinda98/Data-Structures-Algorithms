package com.gayal.algorithms.insertion.sort;

public class InsertionSort {

    public static int[] sort(int[] array) {

        for (int i = 1; i < array.length; i++) {

            int element = array[i];
            int index = i;

            for (int j = i; j > 0; j--) {

                if (array[j - 1] > element) {
                    array[j] = array[j - 1];
                    index = j;
                } else {
                    break;
                }

            }

            array[index - 1] = element;

        }

        return array;

    }

}