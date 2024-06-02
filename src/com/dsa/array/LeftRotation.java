package com.dsa.array;

import java.util.Arrays;

public class LeftRotation {
    public  static int[]  leftRotatebyOne(int arr[], int n)
    {
        int temp = arr[0], i;
        for (i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[i] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n= arr.length;
        leftRotate(arr, 2, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void   leftRotate(int[] arr, int d, int n) {
        for(int i=0;i<d;i++){
            leftRotatebyOne(arr, n);
        }
    }

}
