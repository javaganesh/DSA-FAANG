package com.dsa.tes1;

public class AbcTest {
    private static int findEquliBriumPoint(int[] arr) {

        int left=0;
        int right= arr.length-1;
        int leftSum=0;
        int rightSum=0;
        while(left<=right){
            leftSum+=arr[left];
            rightSum+=arr[right];
            if(leftSum<rightSum){
                left++;
            }
            if(leftSum==rightSum){
                if(left<right){
                    left++;
                    right--;
                }
                else{
                    return left+1;
                }

            }
            if(leftSum>rightSum){
                rightSum+=arr[right-1];
                right--;
            }


        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr={1,2,3,4,2,3,1};
        System.out.println( findEquliBriumPoint(arr));


    }


}
