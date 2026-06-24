package com.dsa.recursion_level2;

public class FindMaxiumElemUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 80, 30};

        System.out.println(max(arr, 0));
    }

    private static int max(int[] arr, int idx) {
        if(idx==arr.length-1){
            return arr[idx];
        }

        /*int remMax= max(arr,idx+1);
        if(arr[idx] > remMax){
            return arr[idx];
        }
        else{
            return remMax;
        }*/
        return Math.max(arr[idx], max(arr, idx+ 1));
    }
}
