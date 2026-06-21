package com.dsa.recursion;

public class PowerOfNRecursion {
    private static int powerOfRecursion(int x, int n) {
        if(n==0) return 1;
        int half=powerOfRecursion(x,n/2);
        int result=half*half;
        if(n%2==1){
            result=result*x;
        }
        return result;


    }

    public static void main(String[] args) {
        int result=powerOfRecursion(2,8);
        int result1=powerOfRecursion1(2,8);
        System.out.println(result);
        System.out.println(result1);
    }

    private static int powerOfRecursion1(int x, int n) {
        if(n==0) return 1;
        int half=powerOfRecursion(x,n-1);
         return x*half;

    }


}
