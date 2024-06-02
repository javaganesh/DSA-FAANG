package com.dsa.patter;

public class TwoDiagonalPrint {
    public static void printTwoDiagonal(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - 1 - i || i==j ) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTwoDiagonal(6);
    }
}
