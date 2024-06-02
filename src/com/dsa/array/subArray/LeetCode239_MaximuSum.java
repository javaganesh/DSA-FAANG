package com.dsa.array.subArray;

public class LeetCode239_MaximuSum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] result=new int[nums.length];
        int max=Integer.MIN_VALUE;
        int windowSum=0;
        int j=0;
        for(int i=0;i<k;i++){
            windowSum+=nums[i];

        }
        max=Math.max(windowSum,max);
         result[j++]=windowSum;
        for(int i=k;i<n;i++){
            windowSum+=nums[i]-nums[i-k];


        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        System.out.println(maxSlidingWindow(arr, 3));
    }
}
