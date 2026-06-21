package com.dsa.gcp.sorting;

import java.util.Arrays;

public class BubbleSortDescndingOder {
    private static void bubbleSortDesc(int[] arr) {
         int n= arr.length;
         for(int i=0;i< n-1;i++){
             for(int j=0;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    swapLogic(arr,j,j+1);
                 }
             }
         }
    }

    static void swapLogic(int[] arr, int a, int b) {
        int tem=arr[a];
        arr[a]=arr[b];
        arr[b]=tem;

    }

    public static void main(String[] args) {
        int[] arr={15,-1,2,-2,20,30,-20};
        bubbleSortDesc(arr);
        System.out.println(Arrays.toString(arr));
    }


}
