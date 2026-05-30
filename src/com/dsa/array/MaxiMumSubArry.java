package com.dsa.array;

public class MaxiMumSubArry {

    private static int maxSumArry(int[] arr, int n) {
        int currtSum=0;
        int maxSum=0;
        for(int i=0;i<n;i++){
            if(currtSum<0){
                currtSum=0;
            }
            currtSum+=arr[i];
            maxSum=Math.max(maxSum,currtSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr={-2,-3,4,6,6,-7};
        int result=maxSumArry(arr,arr.length-1);
        System.out.println(result);
    }


}
