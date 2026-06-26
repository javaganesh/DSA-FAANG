package com.dsa.recursion.level2;

public class primeNumber {
    private static boolean isPrime(int n, int divisor) {

        if(n < 2)
            return false;

        if(divisor * divisor > n)
            return true;

        if(n % divisor == 0)
            return false;

        return isPrime(n, divisor + 1);
    }
    public static boolean isPrime(int n) {
        if(n < 2)
            return false;

        for(int i = 2; i < n; i++) {

            if(n % i == 0)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {

    }
}
