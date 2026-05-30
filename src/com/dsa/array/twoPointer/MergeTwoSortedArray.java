package com.dsa.array.twoPointer;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1={2,3,7,8,10,23};
        int[] arr2={1,9,15,4,11,20};
        int[]  mergedArray=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i< arr1.length && j<arr2.length){
            if(arr1[i]< arr2[j]){
               mergedArray[k]=arr1[i];
               i++;
            }
            else {
                mergedArray[k]=arr2[j];
                j++;
            }
            k++;

        }

        while (i<arr1.length){
            mergedArray[k]=arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length){
            mergedArray[k]=arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(mergedArray));
    }
}
