package com.dsa.numberSystem;

public class FindCoPrime {
    private static boolean isCoPrime(int a, int b) {
        return gcd(a,b)==1;
    }
    private static int gcd(int a, int b) {

        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;

    }
    public static void main(String[] args) {
        System.out.println(isCoPrime(9,28));
    }




}
