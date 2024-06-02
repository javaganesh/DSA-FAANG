package com.dsa.leetcode75;

import java.util.Arrays;

class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Initialize prefix and postfix arrays
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        prefix[0] = 1;
        postfix[n - 1] = 1;

        // Compute prefix products
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Compute postfix products
        for (int i = n - 2; i >= 0; i--) {
            postfix[i] = postfix[i + 1] * nums[i + 1];
        }

        // Compute result
        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * postfix[i];
        }

        return result;

    }

    public static void main(String[] args) {
        // Test case
        int[] nums = {1, 2, 3, 4};
        int[] result = Solution.productExceptSelf(nums);

        // Expected output: [24, 12, 8, 6]
        System.out.println("Output: " + Arrays.toString(result));
    }
}
