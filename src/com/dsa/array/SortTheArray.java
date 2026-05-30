package com.dsa.array;

import java.util.Arrays;

public class SortTheArray {
    private static void sortArray(int[] arr) {
     int n= arr.length;
     int[] result=new int[arr.length];
     int left=0;
     int right=n-1;
     for(int i=n-1;i>=0;i--){
         int val;
         if(arr[left]>arr[right]){
             val=arr[left];
             left++;
         }
         else {
             val=arr[right];
             right--;
         }
         result[i]=val;
     }
        System.out.println(Arrays.toString(result));

    }
    public static void main(String[] args) {
        int[] arr={7,6,5,3,4,2,1};
        sortArray(arr);
    }


}
