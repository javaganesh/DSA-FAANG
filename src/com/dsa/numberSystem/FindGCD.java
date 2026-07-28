package com.dsa.numberSystem;

public class FindGCD {
    public static int gcdUsingEcludianRecursion(int a, int b) {
         if(b==0) return a;

        return gcdUsingEcludianRecursion(b,a%b);
    }
    public static int gcdUsingEcludian(int a, int b) {
        while(b!=0){
            int rm=a%b;
            a=b;
            b=rm;
        }
        return a;
    }
    public static int gcd(int a, int b) {
        int gcd=1;
        for(int i=1;i<=Math.max(a,b);i++){
            if(a%i==0 && b%i==0)
                gcd=i;
        }
        return gcd;
    }
    public static void main(String[] args) {
        System.out.println(gcd(12,18));
        System.out.println(gcdUsingEcludian(12,18));
        System.out.println(gcdUsingEcludianRecursion(12,18));
    }
}
