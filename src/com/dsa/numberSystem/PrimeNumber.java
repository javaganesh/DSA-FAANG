package com.dsa.numberSystem;

public class PrimeNumber {
    public static void printRangee(int n){
        for(int i=0;i<n;i++){
            if(isPrime(i)) {
                System.out.println(i);
            }

        }
    }
    public static boolean isPrime(int  n){
        int c=0;
        for(int i=1;i<=n;i++) {
            if(n%i==0){
                c++;
            }
        }
        if(c>2) return false;

        return true;
    }
    public static void main(String[] args) {
        printRangee(50);

    }
}
