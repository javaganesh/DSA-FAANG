package com.dsa.recursion;

public class Print1ToN {
    public static void main(String[] args) {
        print(10);
    }

    private static void print(int n) {
        if(n==-1){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
