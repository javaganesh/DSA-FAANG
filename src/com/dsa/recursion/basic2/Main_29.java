package com.dsa.recursion.basic2;

public class Main_29 {

    // =========================
    // APPROACH 1: Return Based
    // =========================
    static String removeConsecutive1(String str, int idx) {

        if (idx == str.length()) {
            return "";
        }

        char current = str.charAt(idx);

        String smallAns = removeConsecutive1(str, idx + 1);

        if (smallAns.length() > 0 && smallAns.charAt(0) == current) {
            return smallAns;
        } else {
            return current + smallAns;
        }
    }

    // =========================
    // APPROACH 2: Global StringBuilder
    // =========================
    static StringBuilder sb = new StringBuilder();

    static void removeConsecutive2(String str, int idx, char prev) {

        if (idx == str.length()) {
            return;
        }

        char current = str.charAt(idx);

        if (idx == 0 || current != prev) {
            sb.append(current);
        }

        removeConsecutive2(str, idx + 1, current);
    }

    // =========================
    // APPROACH 3: Backtracking Style
    // =========================
    static String removeConsecutive3(String str, int idx) {

        if (idx == str.length()) {
            return "";
        }

        char current = str.charAt(idx);

        String res = removeConsecutive3(str, idx + 1);

        if (res.length() > 0 && res.charAt(0) == current) {
            return res;
        }

        return current + res;
    }

    // =========================
    // MAIN METHOD
    // =========================
    public static void main(String[] args) {

        String str = "aaabbcdd";

        // Method 1
        System.out.println("Method1: " + removeConsecutive1(str, 0));

        // Method 2
        removeConsecutive2(str, 0, '#');
        System.out.println("Method2: " + sb.toString());

        // Method 3
        System.out.println("Method3: " + removeConsecutive3(str, 0));
    }
}