package com.dsa.hash.easy;

import java.util.Arrays;

public class CountPairusingBinarySearch {
    public static int lowerBound(int[] arr, int start,
                                 int end, int key)
    {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
     //upperBound implementation
    public static int upperBound(int[] arr, int start,
                                 int end, int key)
    {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= key) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }

    private static int getPairsCount(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            int x = k - arr[i];
            int y = lowerBound(arr, i + 1, n, x);
            int z = upperBound(arr, i + 1, n, x);
            c = c + z - y;
        }
        return c;

    }
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, -1};
        int n = arr.length;
        int k = 6;

        // Function call
        System.out.println("Count of pairs is "
                + getPairsCount(arr, n, k));
    }


}
