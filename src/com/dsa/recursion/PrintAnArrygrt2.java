package com.dsa.recursion;

public class PrintAnArrygrt2 {
    public static void main(String[] args) {
        int[] arr={10,11,2,1,0,3};
        printArrayGrt2(arr,0);
    }

    private static void printArrayGrt2(int[] arr,int idx) {

        if(idx== arr.length){
            return;
        }
        if(arr[idx]>2){
            System.out.println(arr[idx]);
        }
        printArrayGrt2(arr, idx+1);
    }
}
