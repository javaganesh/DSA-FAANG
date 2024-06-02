package com.dsa.array.subArray;

public class SlindingWindoqmaxSum {
    static int maxSum(int arr[], int n, int k)
    {
        if (n <= k) {
            System.out.println("Invalid");
            return -1;
        }
        // Compute sum of first window of size k
        int max_sum = 0;
        for (int i = 0; i < k; i++){
            max_sum += arr[i];
        }
        int window_sum=max_sum;
        for(int i=k;i<n;i++){
            window_sum=window_sum+arr[i]-arr[i-k];
            if(window_sum>max_sum){
                max_sum=window_sum;
            }
        }
        return max_sum;



    }
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}
