package com.dsa.stack;



import java.util.Arrays;

public class NonConsecutiveElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 10, 10};
        nonConsecutiveElements(arr);
    }

    private static void nonConsecutiveElements(int[] arr) {
        Arrays.sort(arr); // Ensure the array is sorted.
        int[] temp = new int[arr.length];
        int k = 0; // Start filling temp from index 0

        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is part of any consecutive sequence
            boolean isConsecutive = false;

            // Check with previous element, if any
            if (i > 0 && Math.abs(arr[i] - arr[i - 1]) == 1) {
                isConsecutive = true;
            }
            // Check with next element, if any
            if (i < arr.length - 1 && Math.abs(arr[i] - arr[i + 1]) == 1) {
                isConsecutive = true;
            }

            if (!isConsecutive) {
                // Only add the element to temp if it's not part of a consecutive sequence
                if (k > 0 && temp[k - 1] == arr[i]) {
                    // Skip duplicates unless they're part of a sequence
                    continue;
                }
                temp[k++] = arr[i];
            }
        }

        // Trim the temp array to the actual size of valid elements
        temp = Arrays.copyOf(temp, k);
        System.out.println(Arrays.toString(temp));
    }
}
