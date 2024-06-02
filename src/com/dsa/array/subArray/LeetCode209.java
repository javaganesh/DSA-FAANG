package com.dsa.array.subArray;

public class LeetCode209 {
    public static int minSubArrayLen(int target, int[] nums) {
         int ans=0;
        for(int i=0;i< nums.length;i++){
             int currentSum=0;
             int count=0;
            for(int j=i;j< nums.length;j++){
              currentSum=currentSum+nums[j];
              count++;
              if(currentSum==target){
                  ans=count;
                  break;
              }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
       int[] nums = {1,1,1,1,1,1,1,1};
         int target = 11;
        System.out.println(  minSubArrayLen(target,nums));
    }
}
