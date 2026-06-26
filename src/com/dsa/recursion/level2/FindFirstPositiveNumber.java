package com.dsa.recursion.level2;

public class FindFirstPositiveNumber {
    private static int findFirstPositive(int[] arr, int idx) {
        if(idx == arr.length)
            return -1;

        if(arr[idx] > 0)
            return idx;

        return findFirstPositive(arr, idx + 1);
    }
    public static void main(String[] args) {
        int[] arr = {-5, -10, 8, 20, 30};
        System.out.println(findFirstPositive(arr,0));

    }
}
