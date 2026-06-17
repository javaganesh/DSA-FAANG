package com.dsa.recursion;

public class RecursionSum {
    private static int sumN(int n) {
        if(n==0) return 0;
        int half=sumN(n-1);
        return n+half;

    }
    public static void main(String[] args) {
        int n=5;
        sumN(n);
    }


}
