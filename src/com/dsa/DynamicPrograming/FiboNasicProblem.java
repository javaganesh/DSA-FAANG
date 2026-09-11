package com.dsa.DynamicPrograming;

import java.util.Arrays;

public class FiboNasicProblem {
    private static int[] dp;
    private static int fib(int n) {
        if(n<=1){
            return n;
        }
        if(dp[n]!=0) {
            return dp[n];
        }

        int result=fib(n-2)+fib(n-1);
        dp[n]=result;
        return result;

    }

    public static void main(String[] args) {
        int n=6;
        dp=new int[n+1];
        Arrays.fill(dp,0);
        System.out.println(Arrays.toString(dp));
        int result=fib(n);
        System.out.println(Arrays.toString(dp));
        //System.out.println(result);
    }


}
