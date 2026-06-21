package com.dsa.gcp.sorting;

import static com.dsa.gcp.sorting.BubbleSortDescndingOder.swapLogic;

public class CountSwap {
    private static int bubbleSortCount(int[] arr) {
        int n= arr.length;
        int swapCount=0;
        for(int j = 0; j < n - 1; j++) {
            if(arr[j] > arr[j + 1]) {
                swapCount++;
            }
        }
               return swapCount ;
    }
    public static void main(String[] args) {
        int[] arr={-2,-1,1,23,4};
        System.out.println(bubbleSortCount(arr));
    }
}
