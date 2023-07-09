package com.gayal.algorithms.bubble.sort;

import com.gayal.utils.ArrayHelper;
import com.gayal.utils.FormattedOutputHelper;

import static com.gayal.algorithms.bubble.sort.BubbleSort.sort;

public class BubbleSortApp {

    public static void main(String[] args) {

        System.out.println("BEFORE:");
        int[] array = ArrayHelper.getDescSortedIntArray(30);
        FormattedOutputHelper.print(array);

        System.out.println("AFTER");
        int[] sorted = sort(array);
        FormattedOutputHelper.print(sorted);

    }

}
