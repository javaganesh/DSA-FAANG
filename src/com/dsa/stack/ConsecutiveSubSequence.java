package com.dsa.stack;

import java.util.Arrays;

public class ConsecutiveSubSequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 10, 10};
        consecutiveSubSequence(arr);
    }

    private static void consecutiveSubSequence(int[] arr) {
        Arrays.sort(arr); // Ensure the array is sorted.
        int[] temp = new int[arr.length];
        int k = 0; // Start filling temp from index 0

        for (int i = 0; i < arr.length; i++) {
            // Check if it's the last element or if the next element forms a sequence
            if (i == arr.length - 1 || Math.abs(arr[i] - arr[i + 1]) != 1) {
                if (k > 0 && temp[k - 1] == arr[i]) {
                    // Avoid adding a duplicate of the last added element
                    continue;
                }
                if (i > 0 && Math.abs(arr[i] - arr[i - 1]) == 1) {
                    // This is the end of a consecutive sequence
                    temp[k++] = arr[i];
                }
            } else {
                // This element is part of a consecutive sequence
                temp[k++] = arr[i];
            }
        }

        // Trim the temp array to the actual size of valid elements
        temp = Arrays.copyOf(temp, k);
        System.out.println(Arrays.toString(temp));
    }
}
