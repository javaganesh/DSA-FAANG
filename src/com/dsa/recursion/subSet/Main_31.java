package com.dsa.recursion.subSet;

import java.util.ArrayList;
import java.util.List;

import java.util.*;

public class Main_31 {

    static List<List<Integer>> result = new ArrayList<>();

    static void subsetSum(int[] nums, int idx, int sum, int target, List<Integer> path) {

        // Base case
        if (idx == nums.length) {

            if (sum == target) {
                result.add(new ArrayList<>(path));
            }
            return;
        }

        // 1. EXCLUDE
        subsetSum(nums, idx + 1, sum, target, path);

        // 2. INCLUDE
        path.add(nums[idx]);
        subsetSum(nums, idx + 1, sum + nums[idx], target, path);

        // BACKTRACK
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int target = 3;

        subsetSum(nums, 0, 0, target, new ArrayList<>());

        System.out.println(result);
    }
}