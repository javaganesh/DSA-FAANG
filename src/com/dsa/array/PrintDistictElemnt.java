package com.dsa.array;


import java.util.Arrays;

public class PrintDistictElemnt {
    static void printDistinctUsingSort(int arr[], int n)
    {
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            while(i<n-1 && arr[i]==arr[i+1]){
                i++;
                System.out.print(arr[i] +" ");
            }
        }

    }
    static void printDistinct(int arr[], int n){
        for(int i=0;i<n;i++){
            int j;
            for( j=0;j<i;j++){
                if( arr[i]==arr[j])
                    break;
            }
            if (i == j)
                System.out.print( arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int n = arr.length;
        printDistinctUsingSort(arr, n);
    }
}
