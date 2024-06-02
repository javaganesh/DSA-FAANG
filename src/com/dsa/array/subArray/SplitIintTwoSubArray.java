package com.dsa.array.subArray;

public class SplitIintTwoSubArray {
    public static void main(String[] args) {
        int arr[] = { 1 , 2 , 3 , 4 , 5 , 5  };

        int leftSum=0;

        for(int i=0;i< arr.length;i++){

            leftSum+=arr[i];
            int rightSum = 0 ;
            for(int  j=i+1;j< arr.length;j++){
                rightSum+=arr[j];
            }
            if(leftSum==rightSum){
                System.out.println(i+1);
            }

        }

    }
}
