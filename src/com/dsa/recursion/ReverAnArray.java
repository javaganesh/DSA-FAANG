package com.dsa.recursion;

import java.util.Arrays;

public class ReverAnArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        reverAnArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverAnArray(int[] arr, int start, int end) {
        if(start>=end){
            return;
        }

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverAnArray(arr, start+1, end-1);

    }
}
