package com.dsa.Queue;

import java.util.ArrayList;
import java.util.List;

public class PermutationWithReturn {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> ans = permutation(arr, temp, result, 0);
        System.out.println(ans);
    }

    private static List<List<Integer>> permutation(int[] arr, List<Integer> temp, List<List<Integer>> result, int idx) {

        if (idx == arr.length) {
            result.add(new ArrayList<>(temp)); // Add a copy of temp
            return result;
        }

        // Option 1: Skip current element
        permutation(arr, temp, result, idx + 1);

        // Option 2: Include current element
        temp.add(arr[idx]);
        permutation(arr, temp, result, idx + 1);
        temp.remove(temp.size() - 1); // Remove last added element to backtrack

        return result;
    }
}
