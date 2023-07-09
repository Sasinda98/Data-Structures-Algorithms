package com.gayal.algorithms.insertion.sort;

import com.gayal.utils.ArrayHelper;
import com.gayal.utils.FormattedOutputHelper;

import static com.gayal.algorithms.insertion.sort.InsertionSort.sort;

public class InsertionSortApp {

    public static void main(String[] args) {

        int[] numArray = ArrayHelper.getDescSortedIntArray(10);
        FormattedOutputHelper.print(numArray);

        int[] sorted = sort(numArray);
        FormattedOutputHelper.print(sorted);

    }

}
