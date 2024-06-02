package com.dsa.array.twoPointer;

import java.util.Arrays;

public class SumOftriplet {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int arr_size = arr.length;
        System.out.println( find3Numbers(arr, arr_size, sum));
    }

    private static boolean find3Numbers(int[] arr, int arr_size, int sum) {
        int l, r;
        Arrays.sort(arr);

        for(int i=0;i<arr_size-2;i++){

             l=i+1;
              r = arr_size - 1;
              while (l<r){
                  if(arr[i]+arr[l]+arr[r]==sum){
                      System.out.print("Triplet is " + arr[i] + ", " + arr[l] + ", " + arr[r]);
                      return true;
                  }
                  else if(arr[i]+arr[l]+arr[r] >sum){
                      r--;
                  }
                  else {
                      l++;
                  }
              }
        }
        return false;
    }
}
