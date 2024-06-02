package com.dsa.leetcode75;

public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
       int left=0;
       int right=nums.length;
       while(left<right){
           int mid=(left+right)/2;
           if(nums[mid]==target){
               return mid;
           }
           if(nums[left]<nums[mid]){
               if(target<nums[left] || target>nums[mid]){
                   left=mid-1;
               }
               else{
                   right=mid+1;
               }
           }
           else{
               if(target>nums[right] || target<nums[mid]){
                   right=mid-1;
               }
               else{
                   if(target>nums[right] || target<nums[mid]){
                       right=mid-1;

                   }
                   else {
                       left=mid+1;
                   }
               }

           }

       }
        return -1;

    }
    public static void main(String[] args) {

    }
}
