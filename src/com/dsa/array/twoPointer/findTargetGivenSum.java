package com.dsa.array.twoPointer;

public class findTargetGivenSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7};
        int taget=7;
        int left=0;
        int right=arr.length-1;
        int[] result=new int[2];
        while (left<right){
            int sum=arr[left]+arr[right];
            if(sum==taget){
                result[0]=left+1;
                result[1]=right;
            }
            if(sum>taget){
                right--;
            }
            else {
                left++;
            }


        }
        System.out.println(result);
    }
}
