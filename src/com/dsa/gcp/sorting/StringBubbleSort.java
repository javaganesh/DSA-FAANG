package com.dsa.gcp.sorting;

import java.util.Arrays;

public class StringBubbleSort {
    public static void main(String[] args) {
        String[] arr = {
                "banana",
                "apple",
                "mango",
                "cat"
        };

        bubbleSortString(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSortString(String[] arr) {
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
}
