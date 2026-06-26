package com.dsa.recursion.basic;

public class Main_26 {

    // =========================
    // APPROACH 1: Return Based (with visited array)
    // =========================
    static String removeDuplicates1(String str, int idx, boolean[] visited) {

        if (idx == str.length()) {
            return "";
        }

        char ch = str.charAt(idx);

        if (visited[ch]) {
            return removeDuplicates1(str, idx + 1, visited);
        }

        visited[ch] = true;

        return ch + removeDuplicates1(str, idx + 1, visited);
    }

    // =========================
    // APPROACH 2: Global StringBuilder
    // =========================
    static boolean[] visited2 = new boolean[256];
    static StringBuilder sb = new StringBuilder();

    static void removeDuplicates2(String str, int idx) {

        if (idx == str.length()) {
            return;
        }

        char ch = str.charAt(idx);

        if (!visited2[ch]) {
            visited2[ch] = true;
            sb.append(ch);
        }

        removeDuplicates2(str, idx + 1);
    }

    // =========================
    // APPROACH 3: Backtracking Style
    // =========================
    static String removeDuplicates3(String str, int idx, boolean[] visited) {

        if (idx == str.length()) {
            return "";
        }

        char ch = str.charAt(idx);

        String res = removeDuplicates3(str, idx + 1, visited);

        if (visited[ch]) {
            return res;
        }

        visited[ch] = true;

        return ch + res;
    }

    // =========================
    // MAIN METHOD
    // =========================
    public static void main(String[] args) {

        String str = "aabbcda";

        // Method 1
        boolean[] visited1 = new boolean[256];
        System.out.println("Method1: " + removeDuplicates1(str, 0, visited1));

        // Method 2
        removeDuplicates2(str, 0);
        System.out.println("Method2: " + sb.toString());

        // Method 3
        boolean[] visited3 = new boolean[256];
        System.out.println("Method3: " + removeDuplicates3(str, 0, visited3));
    }
}