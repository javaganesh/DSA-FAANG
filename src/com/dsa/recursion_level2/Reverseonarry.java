package com.dsa.recursion_level2;

import java.util.Arrays;

public class Reverseonarry {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println("Original array:"+ Arrays.toString(arr));

        reverArry(arr,0,arr.length-1);
        System.out.println("after revers arry Array:"+ Arrays.toString(arr));

    }

    private static void reverArry(int[] arr, int low, int high) {
        if(low>=high){
            return;
        }
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        reverArry(arr,low+1,high-1);
    }

    /*private static void reverArry(int[] arr, int low, int high) {

        if(low>=high){
            return;
        }

        reverArry(arr,low+1, high-1);
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }*/
}
