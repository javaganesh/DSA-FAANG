package com.dsa;

public class UberTest {
    private static void findPairSum(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            if((nums[left]+nums[right])> target){
                right--;
            } else if ((nums[left]+nums[right])< target) {
                left++;

            }
            else {
                System.out.println(left+" "+right);
                break;
            }

        }
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target=9;
        findPairSum(nums,target);

    }



}
