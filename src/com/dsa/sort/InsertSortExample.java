package com.dsa.sort;

import java.util.Arrays;

public class InsertSortExample {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,4,5,6};

        System.out.println(Arrays.toString(insertionSort1(arr)));
    }

    private static int[] insertionSort1(int[] arr) {
        int n= arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }
       return arr;
    }
}
