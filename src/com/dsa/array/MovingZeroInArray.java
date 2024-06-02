package com.dsa.array;

import java.util.Arrays;

public class MovingZeroInArray {
    public static int[] movingZeroInArray(int[] arr) {
        int j = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != 0) {
                // Swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++; // Move the pointer for zero elements
            }
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 0, 4, 6, 0, 8, 0};
        int[] re = movingZeroInArray(arr);

        System.out.println(Arrays.toString(re));
    }
}
