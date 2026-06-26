package com.dsa.recursion.basic;

public class Solution_1 {
    static int productDigits(int n) {

        if (n < 10) return n;

        return (n % 10) * productDigits(n / 10);
    }
}
