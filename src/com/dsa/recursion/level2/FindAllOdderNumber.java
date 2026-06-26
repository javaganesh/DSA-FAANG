package com.dsa.recursion.level2;

import java.util.Arrays;

public class FindAllOdderNumber {
    private static int[] returnAllOddNumber(int[] arr, int idx) {
        if(idx== arr.length){
            return new int[0];
        }
        int[] rm=returnAllOddNumber(arr,idx+1);
        if(arr[idx]%2== 1){
            int[] ans=new int[rm.length+1];
            ans[0]=arr[idx];
            for(int i=0;i<rm.length;i++){
                ans[i+1]=rm[i];

            }
            return ans;

        }
        return rm;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(returnAllOddNumber(arr,0)));

    }


}
