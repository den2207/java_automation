package com.lesson4;

public class Main {
    public static void main(String[] args) {
        int i = 7;

        while (i < 100) {
            System.out.println(i);
            i += 7;
        }

        do {
            System.out.println(i);
            i -= 7;
        } while (i >= 7);
    }
}
