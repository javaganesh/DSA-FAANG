package com.dsa.array.slindingWindow;

public class SlindinWindowNaviApproach {
    static int maxSum(int arr[], int n, int k){
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<n-k+1;i++){
            int current_sum = 0;
            for(int j=0;j<k;j++){
                current_sum = current_sum + arr[i + j];
                System.out.print(arr[i + j]+" ");
            }
            System.out.println();
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[] = {5, 2, -1, 0, 3};
        int k = 3;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}
