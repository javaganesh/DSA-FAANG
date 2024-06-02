package com.dsa.array;

public class SlindingWindowProblmemaximumWindow {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int k=4;
        //int max=maximumWindow(arr,k);
        int max1=maximumWindow1(arr,k);

        //System.out.println(max);
        System.out.println(max1);

    }

    private static int maximumWindow1(int[] arr, int k) {
        int left = 0;
        int right = 0;
        int currentSum = 0;
        int maximum = Integer.MIN_VALUE;

        // Slide the window
        while (right < arr.length) {
            currentSum += arr[right];

            // If the window size exceeds k, adjust it
            if (right - left + 1 > k) {
                currentSum -= arr[left];
                left++;
            }

            // Update maximum sum
            if (right - left + 1 == k) {
                maximum = Math.max(maximum, currentSum);
            }

            right++;
        }

        return maximum;
    }


    private static int maximumWindow(int[] arr, int k) {
        int currentSum=0;
        for(int i=0;i<k;i++){
            currentSum+=arr[i];

        }
        int maximumSum=0;
        for(int i=k;i< arr.length;i++){
            maximumSum=currentSum+arr[i]-arr[i-k];
            maximumSum=Math.max(currentSum,maximumSum);
        }
        return maximumSum;
    }
}
