package com.dsa.recursion;

public class MeanOfArray {
    private static  int sum=0;
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int result=meanOfArray(arr,0);
        System.out.println(result);
    }

    private static int meanOfArray(int[] arr,int idx) {
        if(idx>(arr.length-1)){
            return 0;
        }
        sum=sum+arr[idx];
        meanOfArray(arr,idx+1);
        return sum/arr.length;

    }
}
