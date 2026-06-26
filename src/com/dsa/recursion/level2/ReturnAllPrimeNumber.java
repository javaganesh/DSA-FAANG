package com.dsa.recursion.level2;


import java.util.Arrays;

public class ReturnAllPrimeNumber {
    private static boolean isPrime(int n) {

        if(n <= 1)
            return false;

        for(int i = 2; i * i <= n; i++) {

            if(n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 9, 11};
        System.out.println(Arrays.toString(returnAllPrimeNumbder(arr,0)));
    }

    private static int[] returnAllPrimeNumbder(int[] arr, int idx) {
        if(idx== arr.length){
            return new int[0];
        }
        int[] rm=returnAllPrimeNumbder(arr,idx+1);
        if(isPrime(arr[idx])){
            int[] ans=new int[rm.length+1];
            ans[0]=arr[idx];
            for(int i=0;i<rm.length;i++){
                ans[i+1]=rm[i];
            }
            return ans;

        }
        return rm;

    }
}
