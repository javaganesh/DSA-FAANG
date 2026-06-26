package com.dsa.recursion.basic;

public class Solutuon_2 {
    static int findMax(int[] arr, int i, int maxSoFar) {

        if (i == arr.length) {
            return maxSoFar;
        }

        if (arr[i] > maxSoFar) {
            maxSoFar = arr[i];
        }

        return findMax(arr, i + 1, maxSoFar);
    }
}
