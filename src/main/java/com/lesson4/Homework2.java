package com.lesson4;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        int[] arrayToSort = {621, 31, -20, 11, 11, 11, 99, 0};
        int length = arrayToSort.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                }
            }
        }

            System.out.print(Arrays.toString(arrayToSort));
        }

    }
