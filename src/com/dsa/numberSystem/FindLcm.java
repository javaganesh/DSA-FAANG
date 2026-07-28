package com.dsa.numberSystem;

public class FindLcm {
    public static int gcd(int a,int b){

        while (b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
    public static int lcm(int a,int b){
     //   return (a*b)/gcd(a, b);
        return (a / gcd(a, b)) * b;
    }
    public static void main(String[] args) {
        System.out.println(lcm(15,20));
    }
}
