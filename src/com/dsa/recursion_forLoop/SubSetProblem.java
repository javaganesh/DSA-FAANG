package com.dsa.recursion_forLoop;

import java.util.ArrayList;
import java.util.List;

public class SubSetProblem {
    static void solve(int[] arr, int start, List<Integer> subset) {

        // Print current subset
        System.out.println(subset);

        // Try every possible next element
        for (int i = start; i < arr.length; i++) {

            // Choose
            subset.add(arr[i]);

            // Explore
            solve(arr, i + 1, subset);

            // Undo (Backtrack)
            subset.remove(subset.size() - 1);
        }
    }
    public static void main(String[] args) {
     int[] arr={10,20,30};
     solve(arr,0,new ArrayList<>());
    }
}
