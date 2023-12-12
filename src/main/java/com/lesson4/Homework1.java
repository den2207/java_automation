package com.lesson4;

public class Homework1 {
    public static void main(String[] args) {
        int rows = 10;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < rows - i - 1) {
                System.out.print(" ");
                j++;
            }

            int k = 0;
            while (k < 2 * i + 1) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
        }
    }
}

