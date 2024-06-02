package com.dsa.array;

import java.util.Arrays;

public class RemoveOddIntgerArray {
    private static int[] remveOdd(int[] arr) {
        int k=0;
        for(int i=0;i< arr.length;i++){
            if(!(arr[i]%2==0)){
                arr[k++]=arr[i];
            }

        }
        Arrays.fill(arr,k,arr.length,0);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] evenInt=remveOdd(arr);
        System.out.println(Arrays.toString(evenInt));
    }


}
