package com.dsa.recursion.basic;

import java.util.Arrays;

public class Main_5 {

    static void reverseArray(int[] arr, int left, int right) {

        // Base Case
        if (left >= right) {
            return;
        }

        // Swap
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Recursive call
        reverseArray(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        reverseArray(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
