package com.dsa.array;

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,2,4,5,6};
        int i=0;
        int k=0;
        int j= i+1;
        while(i<j){
            if(arr[i]!=arr[j]){
                arr[k++]=arr[i];
                i=j;

            }

            j++;


        }
        System.out.println(Arrays.toString(arr));

    }
}
