package com.dsa.recursion.level2;

public class findLastNegativeNumber {
    private static int findLastNegative(int[] arr, int idx) {

        if(idx == arr.length)
            return -1;

        int rem = findLastNegative(arr, idx + 1);

        return (rem != -1)
                ? rem
                : (arr[idx] < 0 ? idx : -1);
    }
}
