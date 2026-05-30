package com.dsa.array.slindingWindow;

import java.util.LinkedList;
import java.util.Queue;

public class MaxiumSum {

    static int maxSum(int arr[], int n, int k){
        int max=0;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        Queue<Integer>  queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(queue.size()>k){
                sum=sum-queue.poll();

            }

            queue.add(arr[i]);
            // menatine que
            if(queue.size()==k){
             maxSum=Math.max(sum,maxSum);

            }

        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {5, 2, -1, 0, 3};
        int k = 3;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}
