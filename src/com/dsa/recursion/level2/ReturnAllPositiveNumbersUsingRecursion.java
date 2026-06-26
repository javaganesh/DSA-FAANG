package com.dsa.recursion.level2;

import java.util.Arrays;

public class ReturnAllPositiveNumbersUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {-5, 10, -2, 20, 15};
        System.out.println(Arrays.toString(returnAllpostive(arr,0)));
        System.out.println(Arrays.toString(returnAllNegative(arr,0)));
    }

    private static int[] returnAllNegative(int[] arr, int idx) {
        if(idx== arr.length) return new int[0];

        int[] rm= returnAllNegative(arr,idx+1);
        if(arr[idx]<0){
            int[] rs=new int[rm.length+1];
            rs[0]=arr[idx];
            for(int i=0;i<rm.length;i++){
                rs[i+1]=rm[i];
            }
            return rs;
        }
        return rm;
    }

    private static int[] returnAllpostive(int[] arr, int idx) {
        if(idx== arr.length) return new int[0];

        int[] rm= returnAllpostive(arr,idx+1);
        if(arr[idx]>0){
            int[] rs=new int[rm.length+1];
            rs[0]=arr[idx];
            for(int i=0;i<rm.length;i++){
                rs[i+1]=rm[i];
            }
            return rs;
        }
        return rm;
    }

}
