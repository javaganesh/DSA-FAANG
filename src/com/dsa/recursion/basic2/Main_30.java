package com.dsa.recursion.basic2;

import java.util.*;

public class Main_30 {

    // =========================
    // APPROACH 1: Return Style (Backtracking Result Building)
    // =========================
    static List<String> subset1(String str, int idx) {

        if (idx == str.length()) {
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        List<String> small = subset1(str, idx + 1);

        List<String> result = new ArrayList<>(small);

        for (String s : small) {
            result.add(str.charAt(idx) + s);
        }

        return result;
    }

    // =========================
    // APPROACH 2: Global List (Backtracking)
    // =========================
    static List<String> res2 = new ArrayList<>();

    static void subset2(String str, int idx, String path) {

        if (idx == str.length()) {
            res2.add(path);
            return;
        }

        // NOT PICK
        subset2(str, idx + 1, path);

        // PICK
        subset2(str, idx + 1, path + str.charAt(idx));
    }

    // =========================
    // APPROACH 3: Print Style (No return)
    // =========================
    static void subset3(String str, int idx, String path) {

        if (idx == str.length()) {
            System.out.println(path);
            return;
        }

        // exclude
        subset3(str, idx + 1, path);

        // include
        subset3(str, idx + 1, path + str.charAt(idx));
    }

    public static void main(String[] args) {

        String str = "ab";

        // Method 1
        System.out.println("Method1: " + subset1(str, 0));

        // Method 2
        subset2(str, 0, "");
        System.out.println("Method2: " + res2);

        // Method 3
        System.out.println("Method3:");
        subset3(str, 0, "");
    }
}