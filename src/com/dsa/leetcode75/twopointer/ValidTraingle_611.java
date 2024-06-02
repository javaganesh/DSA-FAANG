package com.dsa.leetcode75.twopointer;

public class ValidTraingle_611 {
    public int triangleNumber(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        int ans=0;
        for(int i=2;i<nums.length;i++){
            int left=0,right=i-1;
            while(left<right) {
                if (nums[left] + nums[right] > nums[i]) {
                     ans+=ans=right-left;
                     right--;
                }
                else{
                    left++;
                }
            }
        }
        return  ans;

    }
}
