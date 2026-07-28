package com.dsa.recursion_level2;

public class CountSumOFDigit {
    private static int sumOfDigit(int n) {
        if(n<=0) return 0;

        int curr=n%10;
        int rmd=sumOfDigit(n/10);
        return curr+rmd;
    }
    public static void main(String[] args) {
        int n=123;
        int sum=sumOfDigit(n);
        System.out.println("sum:"+sum);
    }


}
