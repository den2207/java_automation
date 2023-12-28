package com.lesson5;

public class Fraction {
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private int numerator;
    private int denominator;

    public boolean equals(Fraction otherFraction) {
        return this.numerator * otherFraction.denominator == otherFraction.numerator * this.denominator;
    }
}
