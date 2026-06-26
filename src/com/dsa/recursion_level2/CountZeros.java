package com.dsa.recursion_level2;

public class CountZeros {
    private static int countZeros(int[] arr, int idx) {

        if(idx == arr.length)
            return 0;

        return (arr[idx] == 0 ? 1 : 0)
                + countZeros(arr, idx + 1);
    }
    public static void main(String[] args) {

    }
}
