package com.dsa.sort;

import java.util.Arrays;

public class SortZeroAndOne {
    private static void sortBinary(int[] nums) {
     int left=0;
     int right=nums.length-1;
     while (left< right){
         if(nums[left]==0) left++;
         if(nums[right]==1) right--;
         else {
             int temp=nums[left];
             nums[left]=nums[right];
             nums[right]=temp;
             left++;
             right--;

         }
     }




    }
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1, 0};
        sortBinary(nums);
        System.out.println(Arrays.toString(nums));
    }


}
