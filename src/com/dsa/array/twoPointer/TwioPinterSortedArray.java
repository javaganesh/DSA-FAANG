package com.dsa.array.twoPointer;

import java.util.Arrays;
import java.util.Map;

public class TwioPinterSortedArray {
    private static int[] sorttheArrya(int[] arr) {
        int left=0;
        int right= arr.length-1;
        int[] ans=new int[arr.length];
        int idx= arr.length-1;

        while (left<=right){
         int absLeftValue= Math.abs(arr[left]);
         int absrightValue= Math.abs(arr[right]);
         int leftValueSqure=absLeftValue*absLeftValue;
         int rightValue=absrightValue*absrightValue;
         if(leftValueSqure<rightValue){
             ans[idx]=rightValue;
             right--;
         }
         else {
             ans[idx]=leftValueSqure;
             left++;
         }
         idx--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={-4,-3,-2,0,1,2,5,6};
        int[] result=sorttheArrya(arr);
        System.out.println(Arrays.toString(result));
    }


}
