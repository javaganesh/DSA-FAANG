package com.dsa.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {

    /**
     * Generates all permutations of the given string.
     *
     * @param str   the input string
     * @param perm  the current permutation
     * @param list  the list to store all permutations
     */
    private static void generatePermutations(String str, String perm, List<String> list) {
        if (str.isEmpty()) {
            list.add(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder(str);
            generatePermutations(sb.deleteCharAt(i).toString(), perm + str.charAt(i), list);
        }
    }

    public static void main(String[] args) {
        String str = "aac";
        if (str == null || str.isEmpty()) {
            System.out.println("Input string is null or empty.");
            return;
        }

        List<String> permutations = new ArrayList<>();
        generatePermutations(str, "", permutations);

        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
