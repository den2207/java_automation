package com.lesson5;
import java.util.Scanner;


public class fractionsComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator first fraction and press Enter: ");
        int numerator1 = scanner.nextInt();
        System.out.print("Enter denominator first fraction and press Enter: ");
        int denominator1 = scanner.nextInt();
        Fraction fraction1 = new Fraction(numerator1, denominator1);

        System.out.print("Enter numerator second fraction and press Enter: ");
        int numerator2 = scanner.nextInt();
        System.out.print("Enter denominator second fraction and press Enter: ");
        int denominator2 = scanner.nextInt();
        Fraction fraction2 = new Fraction(numerator2, denominator2);

        boolean result = fraction1.equals(fraction2);
        System.out.println("You 1st fraction1: " + fraction1.getNumerator()+ "/" + fraction1.getDenominator());
        System.out.println("You 2nd fraction1: " + fraction2.getNumerator()+ "/" + fraction2.getDenominator());
        System.out.println("You result: " + result);
    }
}
