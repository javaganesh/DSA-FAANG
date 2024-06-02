package com.dsa.array.subArray;

public class SlidwindGivenSum {
    public static void main(String[] args) {

       int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4, sum = 18;
        System.out.println( slidingWidowProblem(arr,k,sum));
    }

    private static boolean slidingWidowProblem(int[] arr, int k, int sum) {
       int current_sum=0;
        for(int i =0;i<k;i++){
            current_sum=current_sum+arr[i];
        }
        if(current_sum==sum){
            return true;
        }
        for(int i=k;i< arr.length;i++){
            current_sum+=arr[i]-arr[k-i];
            if(current_sum==sum){
                return true;
            }
        }
        return false;


    }
}
