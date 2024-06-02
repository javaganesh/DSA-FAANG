package com.dsa.array.subArray;

public class SubarraySumSlidingWidow {
    public static void main(String[] args) {
        SubarraySumSlidingWidow arraysum = new SubarraySumSlidingWidow();
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        arraysum.subArraySum(arr, n, sum);
    }

    private int subArraySum(int[] arr, int n, int sum) {
        int currentSum = arr[0], start = 0, i;

        for (i = 1; i <= n; i++) {
            // If currentSum exceeds the sum,
            // then remove the starting elements
            while(currentSum>sum && start>i-1){
                currentSum=currentSum-arr[i];
            }
            if(currentSum==sum){
                int p = i - 1;
                System.out.println(
                        "Sum found between indexes " + start
                                + " and " + p);
                return 1;
            }
            if (i < n)
                currentSum = currentSum + arr[i];
        }
        System.out.println("No subarray found");
        return 0;
    }
}
