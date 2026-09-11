package com.dsa.backTracking1;

import java.util.*;

public class BackTrackingTargetSum {

    private static List<List<Integer>> result = new ArrayList<>();

    private static void backTrack(
            int[] arr,
            int idx,
            int currentSum,
            List<Integer> current,
            int target) {

        // Target found
        if (currentSum == target) {
            result.add(new ArrayList<>(current));
            return;
        }

        // No more elements
        if (idx == arr.length) {
            return;
        }

        // TAKE
        current.add(arr[idx]);
        currentSum += arr[idx];

        backTrack(arr, idx + 1, currentSum, current, target);

        // UNDO
        current.remove(current.size() - 1);
        currentSum -= arr[idx];

        // SKIP
        backTrack(arr, idx + 1, currentSum, current, target);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        List<Integer> current = new ArrayList<>();
        int target = 3;
        backTrack(arr, 0, 0, current, target);
        System.out.println(result);
    }
}