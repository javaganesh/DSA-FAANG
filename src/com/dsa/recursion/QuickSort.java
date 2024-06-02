package com.dsa.recursion;

import java.util.Arrays;

public class QuickSort {
    public static  void qickSort(int[] arr,int low,int high){

        int s=low;
        int end=high;
        int mid=(s+end)/2;
        int pivot=arr[mid];

        while(s<end){

            while(arr[s] <pivot){
                s++;
            }

            while(arr[end] >pivot){
                end--;
            }
            if(arr[s]> arr[end]){
                s++;
                end--;

            }
        }
        qickSort(arr, low,end);
        qickSort(arr, s,high);

    }

    public static void main(String[] args) {
     int[] arr={10,30,4,5,60,43,32};
        qickSort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

}
