package com.dsa.array;

import java.util.Arrays;

public class RemoveDuplicateUsingTwoPointer {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4, 2, 2, 5, 6, 6};
        Arrays.sort(arr);
        int left = 0;
        int right = left + 1;
        int k = 0;
        while (right < arr.length) {
            if (arr[left] != arr[right]) {
                arr[k++] = arr[left];
                left++;
                right++;
            } else {
                left = right;
                right++;
            }
        }
        arr[k++] = arr[left]; // Copying the last element
        System.out.println(Arrays.toString(Arrays.copyOf(arr, k)));
    }
}
