package com.dsa.recursion.basic;

public class Main_18 {

    static boolean linearSearch(int[] arr, int i, int target) {

        // Base Case
        if (i == arr.length) {
            return false;
        }

        // Check current element
        if (arr[i] == target) {
            return true;
        }

        // Recursive call
        return linearSearch(arr, i + 1, target);
    }

    public static void main(String[] args) {

        int[] arr = {3, 8, 2, 10, 5};
        int target = 10;

        boolean result = linearSearch(arr, 0, target);

        System.out.println(result);
    }
}