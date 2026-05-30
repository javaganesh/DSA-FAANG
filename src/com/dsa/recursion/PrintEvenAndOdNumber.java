package com.dsa.recursion;

public class PrintEvenAndOdNumber {
    private static void printEvenAndodd(int n) {
        if(n==0){
            return;
        }

        printEvenAndodd(n-1);
        if(n%2==0){
            System.out.println("even:"+n);
        }
        else {
            System.out.println("Odd:"+n);
        }

    }
    public static void main(String[] args) {
        int n=10;
        printEvenAndodd(n);
    }


}
