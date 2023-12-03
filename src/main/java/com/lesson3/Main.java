package com.lesson3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the USD amount");

        double usdAmount = 0;

        if (sc.hasNextDouble()) {
            usdAmount = sc.nextDouble();
            System.out.println("Thank you! You entered " + usdAmount + " USD");
            CurrencyConverter currencyConverter = new CurrencyConverter(0.01, 36.55);
            double finalSum = currencyConverter.calculateTotalAmount(usdAmount);
            System.out.println("Thank you! Your final sum = " + finalSum + " UAH");
        } else {
            System.out.println("Sorry, please enter the amount in the format 0.00");
        }

        sc.close();
    }
}
