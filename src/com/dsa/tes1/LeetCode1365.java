package com.dsa.tes1;

import java.util.Arrays;

public class LeetCode1365 {
    /*public static int[] smallerNumbersThanCurrent(int[] nums) {
        if(nums.length==0){
            return null;
        }
        Arrays.sort(nums);
        int[] resut=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                resut[i]=i;
            }
            else{
                resut[i] =i-1;
            }
        }
        return resut;
    }*/




    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int max = -1;
        for(int num : nums){
            max = Math.max(max, num);
        }

        int[] count = new int[max + 1];
        for(int num : nums){
            count[num]++;
        }

        int[] prefix = new int[count.length + 1];
        for(int i = 1 ; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] + count[i - 1];
        }

        int[] res = new int[nums.length];
        for(int i = 0 ; i < nums.length; i++){
            res[i] = prefix[nums[i]];
        }
        return res;
    }








    public static void main(String[] args) {
        int[] arr={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
}
