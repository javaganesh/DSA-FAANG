package com.dsa.array;

import java.util.Arrays;

public class RemoveDuplicate {
    private static void removeUsingFrquency(int[] arr) {
        int n= arr.length;
        int[] freq=new int[n];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
 ;

        }
        System.out.print("Frequncy:"+ Arrays.toString(freq));
        for(int i=0;i<freq.length;i++){
            if(freq[i]< 1){
                System.out.println(freq[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[]  arr={1,2,1,3,4,5,6,2,3};
        removeUsingFrquency(arr);
    }


}
