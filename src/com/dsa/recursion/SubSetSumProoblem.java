package com.dsa.recursion;

public class SubSetSumProoblem {
    public static void subSetSum(int[] arr,int n,int idx,int sum){

        if(idx>=n){
            System.out.println(sum);
            return;
        }
        //we have we can add current index element
        subSetSum(arr,n,idx+1,sum+arr[idx]);

        //we have we cant add current index element
        subSetSum(arr,n,idx+1,sum);

    }
    public static void main(String[] args) {
        int[] arr={2,4,6};
        subSetSum(arr, arr.length, 0,0);
    }


}
