package com.dsa.recursion.level2;

public class CountCompositeNumber {
    private static boolean isPrime(int n, int divisor) {

        if(n < 2)
            return false;

        if(divisor * divisor > n)
            return true;

        if(n % divisor == 0)
            return false;

        return isPrime(n, divisor + 1);
    }
    private static int countComposite(int[] arr, int idx) {

        if(idx == arr.length)
            return 0;

        int rem = countComposite(arr, idx + 1);

        if(arr[idx] > 1 && !isPrime(arr[idx], 2))
            return 1 + rem;

        return rem;
    }
    public static void main(String[] args) {

    }
}
