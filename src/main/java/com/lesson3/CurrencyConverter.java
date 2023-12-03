package com.lesson3;

public class CurrencyConverter {
    public CurrencyConverter(double commission, double exchangeRate) {
        this.commission = commission;
        this.exchangeRate = exchangeRate;
    }

    private double convertUsdToUah(double usd) {
        return usd * exchangeRate;
    }

    private double calculateCommission(double sum) {
        return sum * commission;
    }

    public double calculateTotalAmount(double usd) {
        double amountInUah = convertUsdToUah(usd);
        double commission = calculateCommission(amountInUah);
        return amountInUah - commission;
    }

    private double commission = 0.01;
    private double exchangeRate = 36.55;
}
