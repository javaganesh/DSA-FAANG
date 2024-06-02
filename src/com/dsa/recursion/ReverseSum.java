package com.dsa.recursion;

public class ReverseSum {
    public static void main(String[] args) {
        System.out.println( reveSumofNumber(10));
    }

    private static int reveSumofNumber(int inputNumer) {
        if(inputNumer<=1){
            return inputNumer;
        }
       return inputNumer + reveSumofNumber(inputNumer-1);
    }
}
