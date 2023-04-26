package org.akulik.interview;

// 1stDibs
public class FibonacciNumber {

    public int fib(int n) {
        return n > 1 ? fib(n - 1) + fib(n - 2) : n;
    }

    public int fib_v2(int N) {
        if (N <= 1) {
            return N;
        }

        int[] cache = new int[N + 1];
        cache[1] = 1;
        for (int i = 2; i <= N; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }

        return cache[N];
    }
}
