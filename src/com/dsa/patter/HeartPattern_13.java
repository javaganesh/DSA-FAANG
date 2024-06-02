package com.dsa.patter;

public class HeartPattern_13 {
    public static void heartPattern(){
        int i, j;
        int n = 6; // Height of the heart
        // Upper part
        for(i = n/2; i <= n; i += 2) {
            // Print leading spaces
            for(j = 1; j <=n-i; j += 2) {
                System.out.print(" ");
            }
            // Print first half of the heart
            for(j = 1; j <= i; j++) {
                System.out.print("😊");
            }
            // Print space between two halves of the heart
            for(j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // Print second half of the heart
            for(j = 1; j <= i; j++) {
                System.out.print("😊");
            }
            System.out.println();
        }
        // Lower part
        for(i = n; i >= 1; i--) {
            for(j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Lower half of the heart
            for(j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("😊");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        heartPattern();
    }
}
