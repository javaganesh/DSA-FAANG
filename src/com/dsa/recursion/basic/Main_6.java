package com.dsa.recursion.basic;

public class Main_6 {

    static boolean isSorted(int[] arr, int i) {

        // Base Case
        if (i == arr.length - 1) {
            return true;
        }

        // Check current pair
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        // Recursive call
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        boolean result = isSorted(arr, 0);

        System.out.println(result);
    }
}