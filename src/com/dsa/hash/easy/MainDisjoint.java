package com.dsa.hash.easy;

import java.util.Arrays;

public class MainDisjoint {
    static boolean areDisjoint(int[] set1, int[] set2, int m, int n) {

        Arrays.sort(set1);

        // Take every element of set2[] and search it in the sorted set1 array
        for (int i = 0; i < n; i++) {
            int lb = Arrays.binarySearch(set1, set2[i]);
            // If the element is present in set1, return false
            if (lb >= 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] set1 = {12, 34, 11, 9, 3};
        int[] set2 = {7, 2, 1, 5};
        int m = set1.length;
        int n = set2.length;
        System.out.println(areDisjoint(set1, set2, m, n) ? "Yes" : "No");
    }
}
