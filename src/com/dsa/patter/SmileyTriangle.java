package com.dsa.patter;

public class SmileyTriangle {
    public static void main(String[] args) {
        int height = 10; // You can change this to increase or decrease the size of the triangle

        // Outer loop handles the number of rows
        smaileFace(height);
    }

    private static void smaileFace(int height) {
        for (int i = 0; i < height; i++) {
            // Inner loop prints smileys in each row
            for (int j = 0; j <= i; j++) {
                System.out.print("😊 ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
