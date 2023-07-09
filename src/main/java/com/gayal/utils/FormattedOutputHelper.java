package com.gayal.utils;

public class FormattedOutputHelper {

    public static void print(int[] array) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int j : array) stringBuilder.append(j).append(", ");
        String content = stringBuilder.substring(0, stringBuilder.length() - 2);
        System.out.printf("[ %s ]%n", content);

    }

}
