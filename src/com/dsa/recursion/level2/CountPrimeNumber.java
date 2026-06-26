package com.dsa.recursion.level2;

public class CountPrimeNumber {
    private static boolean isPrime(int n, int divisor) {

        if(n < 2)
            return false;

        if(divisor * divisor > n)
            return true;

        if(n % divisor == 0)
            return false;

        return isPrime(n, divisor + 1);
    }
    private static int countPrimes(int[] arr, int idx) {

        if(idx == arr.length)
            return 0;

        return (isPrime(arr[idx], 2) ? 1 : 0)
                + countPrimes(arr, idx + 1);
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8, 11};
        System.out.println(countPrimes(arr,0));
    }
}
