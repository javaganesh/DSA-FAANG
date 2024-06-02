package com.dsa.stack;

import com.dsa.wipro.Solution;

import java.util.Arrays;

public class NextGreterelemnt {
    private static void nextgreterElemnt(int[] nums) {
     int[] result=new int[nums.length];

     for(int i=0;i<nums.length;i++){
          boolean flag=false;
         for(int j=i+1;j<nums.length;j++){
             if(nums[i]<nums[j]){
                 result[i]=nums[j];
                 flag=true;
                 break;
             }

         }
         if(!flag){
             result[i]=-1;
         }
     }

        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] nums={1,3,2,7,8,6,5,6};
        nextgreterElemnt(nums);
    }


}
