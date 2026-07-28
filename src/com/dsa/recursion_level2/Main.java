package com.dsa.recursion_level2;

public class Main {

    static int reverse(int n) {
        int digits = (int) Math.log10(n);
        return helper(n, digits);
    }

    static int helper(int n, int digits) {

        if (n < 10) {
            return n;
        }

        int lastDigit = n % 10;

        return lastDigit * (int) Math.pow(10, digits)
                + helper(n / 10, digits - 1);
    }

    static boolean isPalindrome(int n) {

        return n == reverse(n);

    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(1221));

    }
}