package com.dsa.recursion_level2;

public class FindMinimumElementinArrayUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 80, 30};

        System.out.println(min(arr, 0));
    }

    private static int min(int[] arr, int idx) {
         if(arr.length-1==idx) return arr[idx];

        int remain=min(arr,idx+1);
         if(arr[idx]< remain){
             return arr[idx];
         }
         else {
             return remain;
         }

    }
}
