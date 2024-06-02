package com.dsa.patter;

/*
 *
 **
 ***
 ****
 *****
 ******
 *****
 ****
 ***
 **
 *

* */
public class Pattern_9 {
    public static void printPatterEstric(int n){
        for(int i=n;i>=-n;i--){
            for(int j=n;j>=Math.abs(i);j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        printPatterEstric(5);

    }
}
