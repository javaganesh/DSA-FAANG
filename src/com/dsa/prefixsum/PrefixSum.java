package com.dsa.prefixsum;

import java.util.Arrays;

public class PrefixSum {
    private static void buidPrefixSum(int[] arr) {
        int[] prefixSum=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            prefixSum[i]=i==0?arr[i]:(arr[i]+prefixSum[i-1]);
        }
        System.out.println(Arrays.toString(prefixSum));
    }
    private static void buidPrefixSumOnlySameAarry(int[] arr) {

        for(int i=0;i< arr.length;i++){
            arr[i]=i==0?arr[i]: arr[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        buidPrefixSum(arr);
        buidPrefixSumOnlySameAarry(arr);
    }


}
