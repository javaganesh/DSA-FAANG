package com.dsa.leetcode75;

import java.util.Map;

public class Leetcode53 {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i< nums.length;i++){
            sum+=nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
       Leetcode53 l=new Leetcode53();
        System.out.println( l.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
