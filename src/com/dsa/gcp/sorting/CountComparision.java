package com.dsa.gcp.sorting;

public class CountComparision {
    public static int bubbleSortComparisonCount(int[] arr) {
        int n = arr.length;
        int comparisonCount = 0;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                comparisonCount++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }

        return comparisonCount;
    }
    public static void main(String[] args) {

    }
}
