package com.dsa.hash.easy;

import java.util.HashSet;
import java.util.Set;

public class DisjointArrays {
    public static boolean areDisjoint(int[] arr1, int n1,
                                      int[] arr2, int n2)
    {

        // Create HashSet objects for arr1 and arr2
        Set<Integer> set1 = new HashSet<Integer>();
        for (int i = 0; i < n1; i++) {
            set1.add(arr1[i]);
        }

        Set<Integer> set2 = new HashSet<Integer>();
        for (int i = 0; i < n2; i++) {
            set2.add(arr2[i]);
        }

        // Create a HashSet to store common elements
        Set<Integer> result = new HashSet<Integer>();
        for (int x : set1) {
            if (set2.contains(x)) {
                result.add(x);
            }
        }

        // If result set is not empty, then arrays are not
        // disjoint
        if (!result.isEmpty()) {
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {

        int[] arr1 = { 10, 5, 3, 4, 6 };
        int n1 = arr1.length;

        int[] arr2 = { 8, 7, 9, 3 };
        int n2 = arr2.length;

        // Check if arrays are disjoint
        if (areDisjoint(arr1, n1, arr2, n2)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
