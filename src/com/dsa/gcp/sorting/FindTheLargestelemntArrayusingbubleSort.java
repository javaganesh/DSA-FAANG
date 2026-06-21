package com.dsa.gcp.sorting;

public class FindTheLargestelemntArrayusingbubleSort {
    private static int findLargestUsigBuubleSort(int[] arr) {
     int n=arr.length;
     for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
         for(int j=0;j<n-i-1;j++){
             if(arr[j]>arr[j+1]) {
                 swapLogic(arr,j,j+1);
             }
         }
     }
     return arr[arr.length-1];
    }
    static void swapLogic(int[] arr, int a, int b) {
        int tem=arr[a];
        arr[a]=arr[b];
        arr[b]=tem;

    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        System.out.println("largets element:"+findLargestUsigBuubleSort(arr));

    }


}
