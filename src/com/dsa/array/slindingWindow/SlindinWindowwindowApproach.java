package com.dsa.array.slindingWindow;

public class SlindinWindowwindowApproach {
    static int maxSum(int arr[], int n, int k){
        // validat length n always gt then k
        if(n<=k) return 0;
        int i=0;
        int max_sum = 0;
        while (i<k){
           max_sum=max_sum+arr[i];
           i++;
        }
        int windowSum=max_sum;
        int  j=k;
        while (j<n){

           max_sum=max_sum-arr[j-k]+arr[j];
           j++;
           windowSum=Math.max(max_sum,windowSum);
        }
      return windowSum;

    }
    public static void main(String[] args) {
        int arr[] = {5, 2, -1, 0, 3};
        int k = 3;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}
