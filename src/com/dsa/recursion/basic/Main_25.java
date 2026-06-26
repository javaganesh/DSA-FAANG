package com.dsa.recursion.basic;

public class Main_25 {

    // =========================
    // APPROACH 1: Return Based
    // =========================
    static String removeVowels1(String str, int idx) {

        if (idx == str.length()) {
            return "";
        }

        char ch = str.charAt(idx);

        String smallAns = removeVowels1(str, idx + 1);

        if (isVowel(ch)) {
            return smallAns;
        } else {
            return ch + smallAns;
        }
    }

    // =========================
    // APPROACH 2: Global Variable
    // =========================
    static StringBuilder sb = new StringBuilder();

    static void removeVowels2(String str, int idx) {

        if (idx == str.length()) {
            return;
        }

        char ch = str.charAt(idx);

        if (!isVowel(ch)) {
            sb.append(ch);
        }

        removeVowels2(str, idx + 1);
    }

    // =========================
    // APPROACH 3: Backtracking Style
    // =========================
    static String removeVowels3(String str, int idx) {

        if (idx == str.length()) {
            return "";
        }

        String res = removeVowels3(str, idx + 1);

        char ch = str.charAt(idx);

        if (isVowel(ch)) {
            return res;
        }

        return ch + res;
    }

    // Helper function
    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // =========================
    // MAIN METHOD
    // =========================
    public static void main(String[] args) {

        String str = "education";

        // Method 1
        System.out.println("Method1: " + removeVowels1(str, 0));

        // Method 2
        removeVowels2(str, 0);
        System.out.println("Method2: " + sb.toString());

        // Method 3
        System.out.println("Method3: " + removeVowels3(str, 0));
    }
}
