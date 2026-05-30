package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSetSum {
    private static void subsetSum(int[] arr) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        System.out.println(subSetSumProblem(arr, arr.length, list, ans, 0));
    }

    private static List<List<Integer>> subSetSumProblem(int[] arr, int n, List<Integer> list, List<List<Integer>> ans, int idx) {

        if (idx == n) {
            // Create a new list to avoid mutation issues
            ans.add(new ArrayList<>(list));
            return ans;
        }

        // Exclude the current element and proceed
        subSetSumProblem(arr, n, list, ans, idx + 1);

        // Include the current element and proceed
        list.add(arr[idx]);
        subSetSumProblem(arr, n, list, ans, idx + 1);

        // Backtrack: remove the last element added
        list.remove(list.size() - 1);

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6};
        subsetSum(arr);
    }
}
