package com.dsa.recursion_level2;

public class FindMaxiumElemntIndex {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 80, 30};
        System.out.println(minMumElemnIndex(arr,0));
        System.out.println(maxIndex(arr,0));

    }

    private static int minMumElemnIndex(int[] arr, int idx) {

        if(idx == arr.length - 1)
            return idx;

        int rm = minMumElemnIndex(arr, idx + 1);

        if(arr[idx] < arr[rm])
            return idx;

        return rm;
    }
    static int maxIndex(int[] arr, int idx) {

        if(idx == arr.length - 1)
            return idx;

        int remMaxIndex = maxIndex(arr, idx + 1);

        if(arr[idx] > arr[remMaxIndex])
            return idx;

        return remMaxIndex;
    }
}
