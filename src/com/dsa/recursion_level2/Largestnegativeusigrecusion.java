package com.dsa.recursion_level2;

import java.util.Map;

public class Largestnegativeusigrecusion {
    public static void main(String[] args) {
        int[] arr = {-10, -5, 20, -2, 15};
        int idx = largestNegative(arr, 0);
        System.out.println(arr[idx]);
    }

    private static int largestNegative(int[] arr, int idx) {

        if(idx == arr.length-1)
            return Integer.MIN_VALUE;

        int rem = largestNegative(arr, idx + 1);

        if(arr[idx] < 0)
            return Math.max(arr[idx], rem);

        return rem;
    }
}
