package com.dsa.recursion;

import java.util.Arrays;

public class MergeSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr={11,12,5,6,86,3,2,23};
        int[] mergeSortResult=mergesort(arr);
        System.out.println(Arrays.toString(mergeSortResult));
    }

    private static int[] mergesort(int[] arr) {
        if(arr.length==1)
            return arr;
       int mid= arr.length/2;

        int[] leftArray =mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] rightArray =mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(leftArray,rightArray);
    }
    private static int[] merge(int[] left,int[] right){
        int[] resultArray=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i< left.length && j< right.length){
            if(left[i] <right[j]){
                resultArray[k]=left[i];
                i++;
            }
            else {
                resultArray[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            resultArray[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            resultArray[k]=right[j];
            j++;
            k++;
        }
        return  resultArray;
    }

}
