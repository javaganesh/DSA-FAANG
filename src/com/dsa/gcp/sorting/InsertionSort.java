package com.dsa.gcp.sorting;

import java.util.Arrays;

public class InsertionSort {
    private static void insertionSort(int[] arr) {
      int n= arr.length;
      for(int i=0;i<n;i++){
          int min=Integer.MAX_VALUE;
          int minIdx=0;
          for(int j=i;j<n;j++){
              if(arr[j]<min){
                  min=arr[j];
                  minIdx=j;
              }
          }
          //swap
          int temp=arr[i];
          arr[i]=arr[minIdx];
          arr[minIdx]=temp;
      }
    }
    public static void main(String[] args) {
        int[] arr={-1,-2,3,5,7,9,8};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
