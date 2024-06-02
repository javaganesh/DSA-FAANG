package com.dsa.array;

public class SlindingWindowProblem {
    private static int slindingWindow(int[] nums,int windowSize) {
        int left=0,right=0;
        int max=Integer.MIN_VALUE;
        int windowSum=0;

        while(right< nums.length){
            windowSum+=nums[right];
            if(right-left+1== windowSize){
                max=Math.max(max,windowSum);
                windowSum-=nums[left];
                left++;
            }

            right++;

        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr= {10, 11, 20, 30, 31, 40, 41, 45};
        int windowSize=3;
        System.out.println( slindingWindow(arr,windowSize));


    }


}
