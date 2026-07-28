package com.dsa.twoPointer;

import java.util.Arrays;

public class MoveZeroAtTheEnd {
    private static void moveZeroAtTheEnd(int[] arr) {
    int n=arr.length;
    int i=0;
    for(int j=0;i<n;i++){
        if(arr[j]!=0){
            arr[i]=arr[j];
            i++;
        }
    }
    while (i<arr.length){
        arr[i]=0;
    }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[] arr={1,12,0,0,0,2,3};
        moveZeroAtTheEnd(arr);
    }


}
