package com.dsa.sort;

import java.util.Arrays;

public class insertionsort {
    private static void insertionSortAl(int[] arr) {
        for(int i=0;i< arr.length-1;i++){
            int minIdex=0;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[minIdex]){
                    minIdex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIdex];
            arr[minIdex]=temp;

        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 2, 10, 4, 1};
        insertionSortAl(arr);

    }


}
