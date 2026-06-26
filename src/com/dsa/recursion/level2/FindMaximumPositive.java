package com.dsa.recursion.level2;

public class FindMaximumPositive {
    private static int findMaximumPositive(int[] arr, int idx) {

        if(idx == arr.length)
            return Integer.MIN_VALUE;

        int rem = findMaximumPositive(arr, idx + 1);

        if(arr[idx] > 0)
            return Math.max(arr[idx], rem);

        return rem;
    }
    public static void main(String[] args) {

    }
}
