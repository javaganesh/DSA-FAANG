package com.dsa.recursion.basic;

public class Main_22 {

    // =========================
    // APPROACH 1: Two Pointer (Return Based)
    // =========================
    static boolean isPalindrome1(int[] arr, int left, int right) {

        if (left >= right) {
            return true;
        }

        if (arr[left] != arr[right]) {
            return false;
        }

        return isPalindrome1(arr, left + 1, right - 1);
    }

    // =========================
    // APPROACH 2: Global Variable
    // =========================
    static boolean isPal2 = true;

    static void isPalindrome2(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        if (arr[left] != arr[right]) {
            isPal2 = false;
            return;
        }

        isPalindrome2(arr, left + 1, right - 1);
    }

    // =========================
    // APPROACH 3: Backtracking Style
    // =========================
    static boolean isPalindrome3(int[] arr, int left, int right) {

        if (left >= right) {
            return true;
        }

        boolean res = isPalindrome3(arr, left + 1, right - 1);

        if (arr[left] != arr[right]) {
            return false;
        }

        return res;
    }

    // =========================
    // MAIN METHOD
    // =========================
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 1};

        // Method 1
        System.out.println("Method1: " + isPalindrome1(arr, 0, arr.length - 1));

        // Method 2
        isPalindrome2(arr, 0, arr.length - 1);
        System.out.println("Method2: " + isPal2);

        // Method 3
        System.out.println("Method3: " + isPalindrome3(arr, 0, arr.length - 1));
    }
}