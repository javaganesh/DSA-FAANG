package com.dsa.numberSystem;

public class FindTheNextPrime {
    private static int findNextPrime(int n) {
        n++;
        while(!isPrime(n)){
            n++;
        }
        return n;
    }
    public static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0)
                return false;

        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(findNextPrime(29));
    }


}
