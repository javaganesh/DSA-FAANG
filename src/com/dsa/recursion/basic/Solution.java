package com.dsa.recursion.basic;

public class Solution {
    static int sumDigits(int n) {

        if (n == 0) return 0;

        int r=n%10;
        int rm=sumDigits(n/2);
        return r+rm;


    }

    public static void main(String[] args) {
        System.out.println(sumDigits(345));
    }

}
