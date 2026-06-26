package com.dsa.recursion.basic;

public class Main_20 {

    static int lastOccurrence(int[] arr, int i, int target) {

        // Base Case
        if (i == arr.length) {
            return -1;
        }

        // Go deep first
        int index = lastOccurrence(arr, i + 1, target);

        // If found in deeper call, return it
        if (index != -1) {
            return index;
        }

        // Otherwise check current index
        if (arr[i] == target) {
            return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {3, 8, 2, 8, 5};
        int target = 8;

        int result = lastOccurrence(arr, 0, target);

        System.out.println(result);
    }
}