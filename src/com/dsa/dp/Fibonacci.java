package com.dsa.dp;

public class Fibonacci {
    public static int fib(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        int ans = fib(n - 1, dp) + fib(n - 2, dp);
        dp[n] = ans;
        return ans;
    }

    public static void main(String[] args) {
        int n = 10; // we want fib(10)
        int[] dp = new int[n + 1];

        // initialize dp with -1
        for (int i = 0; i <= n; i++) {
            dp[i] = 0;
        }

        System.out.println(fib(n, dp)); // prints 55
    }
}
