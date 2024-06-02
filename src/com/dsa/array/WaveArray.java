package com.dsa.array;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        sortInWave(arr, n);
        System.out.println(Arrays.toString(arr));
    }
private static void swap(int[] arr,int  i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
}

    private static void sortInWave(int[] arr, int n) {
        Arrays.sort(arr);
        for(int i=0;i < arr.length - 1; i+=2){
            swap(arr,i,i+1);
        }
    }
}
