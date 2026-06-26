package com.dsa.recursion_level2;

public class FindMinimumElemengtUsingArray {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 80, 30};
        int min=findMinMum(arr,0);
        System.out.println(min);
    }

    private static int findMinMum(int[] arr, int idx) {
        if(idx==arr.length-1){
            return arr[idx];
        }

        int min=findMinMum(arr,idx+1);
        return Math.min(arr[idx],min);

    }
}
