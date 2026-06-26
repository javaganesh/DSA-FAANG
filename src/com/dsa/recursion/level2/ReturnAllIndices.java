package com.dsa.recursion.level2;

import java.util.Arrays;

public class ReturnAllIndices {
    private static int[] returnAllIndices(int[] arr, int idx, int target) {
        if(idx==arr.length){
            return new int[0];
        }

        int[] rm=returnAllIndices(arr,idx+1,target);
        if(arr[idx]==target){
            int[] ans=new int[rm.length+1];
            ans[0]=idx;
            for(int i=0;i<rm.length;i++){
                ans[i+1]=rm[i];
            }
            return ans;


        }
        return rm;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 20};
        int target = 20;
        System.out.println(Arrays.toString(returnAllIndices(arr,0,target)));
    }


}
