package com.dsa.prefixsum;

/*



Back End

Question No: 1

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1: Input: nums = [1,2,3,4] Output: [24,12,8,6]

Example 2: Input: nums = [-1,1,0,-3,3] Output: [0,0,9,0,0]

Question No 2.

you are given a string s, which contains stars *. In one operation, you can: · Choose a star in s. · Remove the closest non-star character to its left, as well as remove the star itself.

Return the string after all stars have been removed.

Note:

· The input will be generated such that the operation is always possible.

· It can be shown that the resulting string will always be unique.

Example 1:

Input: s = ""leet**cod*e"" Output: ""lecoe"" Explanation: Performing the removals from left to right: - The closest character to the 1st star is 't' in ""leet**cod*e"". s becomes ""lee*cod*e"". - The closest character to the 2nd star is 'e' in ""lee*cod*e"". s becomes ""lecod*e"". - The closest character to the 3rd star is 'd' in ""lecod*e"". s becomes ""lecoe"". There are no more stars, so we return ""lecoe"".

Example 2:

Input: s = ""erase*****"" Output: """" Explanation: The entire string is removed, so we return an empty string.



 */

import java.util.Arrays;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int n = nums.length;

        // Prefix Product
        int[] pf = new int[n];
        pf[0] = 1;
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] * nums[i - 1];
        }
        System.out.println("Prefix : " + Arrays.toString(pf));

        // Suffix Product
        int[] sf = new int[n];
        sf[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            sf[i] = sf[i + 1] * nums[i + 1];
        }
        System.out.println("Suffix : " + Arrays.toString(sf));

        // Answer
        int[] ans = new int[n];

        // FIX: Start from 0
        // FIX: Loop until i < n
        // FIX: Multiply pf[i] and sf[i]
        for (int i = 0; i < n; i++) {
            ans[i] = pf[i] * sf[i];
        }

        System.out.println("Nums   : " + Arrays.toString(nums));
        System.out.println("Answer : " + Arrays.toString(ans));
    }
}