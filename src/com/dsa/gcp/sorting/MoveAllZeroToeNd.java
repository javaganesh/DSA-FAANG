package com.dsa.gcp.sorting;

import java.util.Arrays;

public class MoveAllZeroToeNd {
    public static void moveZeros(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;
        for (int num : arr) {
            if (num != 0) {
                temp[index++] = num;
            }
        }

        System.out.println("half tem:"+Arrays.toString(temp));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    private static void brueForApproch(int[] arr) {
     int n= arr.length;;
     int[] temp=new int[n];
     int idx=0;
     for(int i=0;i<n;i++){
         if(arr[i]!=0){
             temp[idx++]=arr[i];
         }
     }
        System.out.println();
        while(idx< arr.length){
            temp[idx++]=0;
        }
        System.out.println(Arrays.toString(temp));
    }

    private static void moveZerosUsingSwap(int[] arr) {
       int left=0;
       for(int rigght=0;rigght< arr.length;rigght++){
           if(arr[rigght]!=0){
               int temp=arr[rigght];
               arr[rigght]=arr[left];
               arr[left]=temp;
               left++;
           }


       }

    }
    public static void moveZerosUsingSwapBubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,0,0,4,0,6};
        //brueForApproch(arr);
       // moveZeros(arr);
        //System.out.println(Arrays.toString(arr));
       // moveZerosUsingSwap(arr);
        //System.out.println(Arrays.toString(arr));
        moveZerosUsingSwapBubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }




}
