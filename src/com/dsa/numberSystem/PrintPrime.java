package com.dsa.numberSystem;

import static com.dsa.numberSystem.PrimeNumber.isPrime;

public class PrintPrime {
    public static void sieve(int n){

        //make one varibale
        boolean[] isPrime=new boolean[n+1];
        for(int i=1;i<=n;i++){
            //suppose every number is prime
            isPrime[i]=true;
        }
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                for(int j=i*i;i<=n;j+=i){
                    isPrime[i]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(isPrime[i]==true) {
                System.out.println(i);
            }

        }

    }
    public static void main(String[] args) {
     sieve(50);
    }
}
