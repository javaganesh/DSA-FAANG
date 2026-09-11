package com.dsa.recursion_forLoop;

import java.util.ArrayList;

public class CombinationSum {
    private static void combinationSum(int[] nums, int target, int start, ArrayList<Object> list) {
        if(target==0){
            System.out.println(list);
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start;i<nums.length;i++){
            list.add(nums[i]);
            combinationSum(nums,target-nums[i],i,list);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {2, 3};
        combinationSum(nums, 6, 0, new ArrayList<>());
    }


}
