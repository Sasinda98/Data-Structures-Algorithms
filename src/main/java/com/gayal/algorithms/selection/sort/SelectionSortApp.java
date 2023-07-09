package com.gayal.algorithms.selection.sort;

import com.gayal.utils.ArrayHelper;
import com.gayal.utils.FormattedOutputHelper;

import static com.gayal.algorithms.selection.sort.SelectionSort.sort;

public class SelectionSortApp {

    private static final int ARRAY_SIZE = 20;

    public static void main(String[] args) {

        System.out.println("BEFORE:");
        int[] numArray = ArrayHelper.getDescSortedIntArray(30);
        FormattedOutputHelper.print(numArray);

        System.out.println("AFTER:");
        int[] sorted = sort(numArray);
        FormattedOutputHelper.print(sorted);

    }

}
