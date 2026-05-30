package com.dsa.collabrate;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 6,7,8,9 };
        int[]  arr2 = { 2,3,10,11 };

        //merege it
        int[] result=new int[arr1.length+arr2.length];
        int i=0,j=0;
        int t=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                result[t++]=arr1[i];
                i++;
            }
            else{
                result[t++]=arr2[j];
                j++;
            }
        }
        while (i<arr1.length){
            result[t++]=arr1[i];
            i++;
        }
        while (j<arr2.length){
            result[t++]=arr2[j];
            j++;
        }
   // 1  2


    }
}
