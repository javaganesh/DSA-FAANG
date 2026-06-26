package com.dsa.recursion.basic2;

public class Main_28 {

    // =========================
    // APPROACH 1: Return Based
    // =========================
    static String toggle1(String str, int idx) {

        if (idx == str.length()) {
            return "";
        }

        char ch = str.charAt(idx);

        String smallAns = toggle1(str, idx + 1);

        if (Character.isUpperCase(ch)) {
            return Character.toLowerCase(ch) + smallAns;
        } else {
            return Character.toUpperCase(ch) + smallAns;
        }
    }

    // =========================
    // APPROACH 2: Global StringBuilder
    // =========================
    static StringBuilder sb = new StringBuilder();

    static void toggle2(String str, int idx) {

        if (idx == str.length()) {
            return;
        }

        char ch = str.charAt(idx);

        if (Character.isUpperCase(ch)) {
            sb.append(Character.toLowerCase(ch));
        } else {
            sb.append(Character.toUpperCase(ch));
        }

        toggle2(str, idx + 1);
    }

    // =========================
    // APPROACH 3: Backtracking Style
    // =========================
    static String toggle3(String str, int idx) {

        if (idx == str.length()) {
            return "";
        }

        char ch = str.charAt(idx);

        String res = toggle3(str, idx + 1);

        if (Character.isUpperCase(ch)) {
            return Character.toLowerCase(ch) + res;
        } else {
            return Character.toUpperCase(ch) + res;
        }
    }

    // =========================
    // MAIN METHOD
    // =========================
    public static void main(String[] args) {

        String str = "JaVa";

        // Method 1
        System.out.println("Method1: " + toggle1(str, 0));

        // Method 2
        toggle2(str, 0);
        System.out.println("Method2: " + sb.toString());

        // Method 3
        System.out.println("Method3: " + toggle3(str, 0));
    }
}