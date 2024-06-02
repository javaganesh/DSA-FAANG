package com.dsa.loop;

public class PrimeNumber {
    public static boolean  ispramiNumber(int n){
         boolean isPrime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int n = 100;

        for(int i=1; i<=n; i++){
            //check if current number is prime
            if(ispramiNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
