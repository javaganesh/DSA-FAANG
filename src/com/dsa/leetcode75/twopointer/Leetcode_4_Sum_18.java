package com.dsa.leetcode75.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Leetcode_4_Sum_18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set=new HashSet<>();
        List<List<Integer>> result=new ArrayList();
        for(int i=0;i< nums.length-3;i++){
            for(int j=i+1;j< nums.length-2;j++){
                int left=j+1,right= nums.length-1;
                while(left<right){
                    int sum=nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum <target){
                       left++;
                    }
                    else if(sum>target){
                     right--;
                    }
                    else{
                        if(!set.contains(Arrays.asList(nums[i],nums[j],nums[left],nums[right]))){
                            set.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                            result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        }
                        left++;
                        right--;
                    }
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        //System.out.println(fourSum(new int[]{1,0,-1,0,-2,2},0));
        System.out.println(fourSum(new int[]{2,2,2,2,2},8));
    }
}
