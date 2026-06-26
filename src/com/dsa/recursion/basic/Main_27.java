package com.dsa.recursion.basic;

public class Main_27 {

    // =========================
    // APPROACH 1: Return Based
    // =========================
    static String replace1(String str, int idx, char oldChar, char newChar) {

        if (idx == str.length()) {
            return "";
        }

        char ch = str.charAt(idx);

        String smallAns = replace1(str, idx + 1, oldChar, newChar);

        if (ch == oldChar) {
            return newChar + smallAns;
        } else {
            return ch + smallAns;
        }
    }

    // =========================
    // APPROACH 2: Global StringBuilder
    // =========================
    static StringBuilder sb = new StringBuilder();

    static void replace2(String str, int idx, char oldChar, char newChar) {

        if (idx == str.length()) {
            return;
        }

        char ch = str.charAt(idx);

        if (ch == oldChar) {
            sb.append(newChar);
        } else {
            sb.append(ch);
        }

        replace2(str, idx + 1, oldChar, newChar);
    }

    // =========================
    // APPROACH 3: Backtracking Style
    // =========================
    static String replace3(String str, int idx, char oldChar, char newChar) {

        if (idx == str.length()) {
            return "";
        }

        char ch = str.charAt(idx);

        String res = replace3(str, idx + 1, oldChar, newChar);

        if (ch == oldChar) {
            return newChar + res;
        } else {
            return ch + res;
        }
    }

    // =========================
    // MAIN METHOD
    // =========================
    public static void main(String[] args) {

        String str = "banana";

        char oldChar = 'a';
        char newChar = 'x';

        // Method 1
        System.out.println("Method1: " + replace1(str, 0, oldChar, newChar));

        // Method 2
        replace2(str, 0, oldChar, newChar);
        System.out.println("Method2: " + sb.toString());

        // Method 3
        System.out.println("Method3: " + replace3(str, 0, oldChar, newChar));
    }
}