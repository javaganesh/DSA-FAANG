package com.dsa.tes1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountNumberOfOccurance {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,3,3,4,2,5,5,5};
        int[] hash=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            int elemnt=arr[i];
            hash[elemnt]=hash[elemnt]+1;
        }
        System.out.println(Arrays.toString(hash));
    }
}
