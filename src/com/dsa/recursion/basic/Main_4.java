package com.dsa.recursion.basic;

public class Main_4 {

    static int findMin(int[] arr, int i, int minSoFar) {

        // Base Case
        if (i == arr.length) {
            return minSoFar;
        }

        // Update minimum
        if (arr[i] < minSoFar) {
            minSoFar = arr[i];
        }

        // Recursive call
        return findMin(arr, i + 1, minSoFar);
    }

    public static void main(String[] args) {

        int[] arr = {3, 8, 2, 10, 5};

        int result = findMin(arr, 0, arr[0]);

        System.out.println("Minimum: " + result);
    }
}