package com.dsa.array;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        // Adding an empty subset as the initial subset
        result.add(new ArrayList<Integer>());

        subsetSolution(nums, n, result);
        return result;

    }

    private static void subsetSolution(int[] nums, int n, List<List<Integer>> result) {
        for (int i = 0; i < n; i++) {
            List<List<Integer>> temp = new ArrayList<>(result);
            for (List<Integer> list : temp) {
                List<Integer> newList = new ArrayList<>(list);
                newList.add(nums[i]);
                result.add(newList);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        List< List<Integer>> lis=solution.subsets(new int[]{1,2,3});
        System.out.println(lis.toString());

    }
}
