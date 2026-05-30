package com.dsa.array;

import java.util.Arrays;

public class FindNumberzeroAndOneSegriggation {
    private static void solution2(int[] arr) {
        int i=0;
        int n= arr.length;
        int j= n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if (arr[j]==1) {
                j--;
            }
            if(i>j) break;
             else if(arr[i]== 1 && arr[j]==0)
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
        }
    }
    private static void solution1(int[] arr) {
        int numberOfZeroCount=0;
        int numberOfOneCount=1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0) numberOfZeroCount++;
            else numberOfOneCount++;
        }
        for(int i=0;i<numberOfZeroCount;i++){
            arr[i]=0;
        }
        for(int i=numberOfOneCount;i< arr.length;i++){
            arr[i]=1;
       }



    }

    public static void main(String[] args) {
     int[] arr={1,0,0,1,1,1,0,0,1};
    // solution1(arr);
     solution2(arr);
        System.out.println(Arrays.toString(arr));
    }




}
