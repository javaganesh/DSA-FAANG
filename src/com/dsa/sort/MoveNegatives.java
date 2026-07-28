package com.dsa.sort;

import java.util.Arrays;

import java.util.Arrays;

public class MoveNegatives {

    public static void partition(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            if (nums[left] < 0) {

                left++;

            } else if (nums[right] >= 0) {
                right--;

            } else {

                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, -2, 8, -1, 0, -6};
        partition(nums);
        System.out.println(Arrays.toString(nums));
    }
}