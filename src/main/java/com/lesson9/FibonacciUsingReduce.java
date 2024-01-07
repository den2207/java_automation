package com.lesson9;
import java.util.stream.IntStream;

public class FibonacciUsingReduce {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return IntStream.range(2, n)
                .reduce(1, (acc, i) -> {
                    int fib2 = acc + i;
                    return fib2;
                });
    }

    public static void main(String[] args) {
        int fibNumber = 10;
        int result = fib(fibNumber);
        System.out.println(result);
    }
}
