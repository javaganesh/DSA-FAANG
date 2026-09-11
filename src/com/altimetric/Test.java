package com.altimetric;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//Merge two array and Find Second Highest number
int arr1[] = { 4, 5, 13, 22 };
int arr2[] = { 0, 9, 3, 7, 12, 11 };
Arrays.sort(arr1);
Arrays.sort(arr2);


int m= arr1.length;
int n= arr2.length;
int[] sortedArray=new int[m+n];
int k=0;

//merge the arary
       int idx1=0;
       int idx2=0;

       while(idx1< m && idx2 < n){
           if (arr1[idx1] < arr2[idx2]){
               sortedArray[k]=arr1[idx1];
               idx1++;
           }
           else{
               sortedArray[k]=arr2[idx2];
               idx2++;
           }
           k++;

       }

       while(idx1<m){
           sortedArray[k]=arr1[idx1];
           idx1++;
           k++;
       }
        while(idx2<n){
            sortedArray[k]=arr2[idx2];
            idx2++;
            k++;
        }
        System.out.println(Arrays.toString(sortedArray));

        //find 2nd hghest nunber

        int fast=sortedArray[0];
        int second=Integer.MIN_VALUE;
        for(int i=0;i< sortedArray.length;i++){

            if(sortedArray[i]> fast){
                second=fast;
                fast=sortedArray[i];


            }
            if(sortedArray[i] > second && (sortedArray[i]!=fast)){
                second=sortedArray[i];
            }
        }

        System.out.println(fast);
        System.out.println(second);

    }

}
