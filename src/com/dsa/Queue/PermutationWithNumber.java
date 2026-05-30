package com.dsa.Queue;

import java.util.ArrayList;
import java.util.List;

public class PermutationWithNumber {
    private static void permute(int[] arr, List<Integer> temp, List<List<Integer>> ans, List<Boolean> visited) {
        if (arr.length == temp.size()) {
            ans.add(new ArrayList<>(temp)); // Make a copy of temp
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited.get(i)) {
                visited.set(i, true);
                temp.add(arr[i]);
                permute(arr, temp, ans, visited);
                temp.remove(temp.size() - 1); // Remove the last element added
                visited.set(i, false);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Boolean> visited = new ArrayList<>();

        // Initialize the visited list with 'false' for all elements
        for (int i = 0; i < arr.length; i++) {
            visited.add(false);
        }

        permute(arr, temp, ans, visited);

        // Print the result
        for (List<Integer> permutation : ans) {
            System.out.println(permutation);
        }
    }
}
