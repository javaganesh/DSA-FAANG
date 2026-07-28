package com.dsa.twoPointer;

public class RemoveDuplicate_02 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int i=2;
        for(int j=2;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {

    }
}
