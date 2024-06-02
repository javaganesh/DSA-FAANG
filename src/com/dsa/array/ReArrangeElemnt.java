package com.dsa.array;

import java.util.Arrays;

public class ReArrangeElemnt {
    static void assign(int arr[], int N) {
        // Sort the array
        Arrays.sort(arr);

        int ans[] = new int[N];
        int ptr1 = 0, ptr2 = N - 1;
        for (int i = 0; i < N; i++) {

            // Assign even indexes with maximum elements
            if (i % 2 == 0)
                ans[i] = arr[ptr2--];

                // Assign odd indexes with remaining elements
            else
                ans[i] = arr[ptr1++];
        }
        for (int i = 0; i < N; i++)
            System.out.print(ans[i] + " ");
    }


    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1 };
        int N = arr.length;
        assign(arr, N);
        System.out.println("=====================================================================");
        rearrange(arr, N);
        for (int i = 0; i < N; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static void rearrange(int[] arr, int n) {
        for (int i = 0; i < n; i += 2) {
            // Compare it with the previous element
            if(i>0 && arr[i-1]>arr[i]){
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }
            if (i < n - 1 && arr[i + 1] > arr[i]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }

        }

    }
}
