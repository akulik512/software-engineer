package org.akulik.interview;

// 1stDibs
public class FibonacciNumber {

    public int fib(int n) {
        return n > 1 ? fib(n - 1) + fib(n - 2) : n;
    }
}
