package com.dsa.leetcode75;

public class MaximuSum {
    public static int maxSubArray(int[] nums) {
        int currentsum=0;
        int maximumsum=0;
        for(int i=0;i<nums.length;i++){
            if(currentsum<0){
                currentsum=0;

            }
            currentsum=currentsum+nums[i];
            maximumsum=Math.max(currentsum,maximumsum);
        }

         return maximumsum;
    }
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaximuSum.maxSubArray(arr));

    }
}
