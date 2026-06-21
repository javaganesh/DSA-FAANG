package com.dsa.gcp.sorting;

import java.util.Arrays;

public class MoveAllNegativeNumberstotheLeftUsingAdjacentSwaps {
    private static void moveNegativesLeft(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > 0 && arr[j + 1] < 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    public static void main(String[] args) {
    int[] arr={1,-2,3,-4,5,-9,10};
    moveNegativesLeft(arr);
    System.out.println(Arrays.toString(arr));
    }
}
