package com.dsa.sort;

public class BubbleSort {
    private static void bubbleSortAlgo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] with arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return; // Array is already sorted
            }
        }

        // Print the sorted array
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 2, 10, 4, 1};
        bubbleSortAlgo(arr);
    }
}
