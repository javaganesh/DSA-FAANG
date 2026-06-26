package com.dsa.recursion.basic;

public class Main_23 {

    static String reverse(String str, int idx) {

        // Base Case
        if (idx == str.length()) {
            return "";
        }

        // Recursive call
        String smallAns = reverse(str, idx + 1);

        // Work while returning
        return smallAns + str.charAt(idx);
    }

    public static void main(String[] args) {

        String str = "java";

        String result = reverse(str, 0);

        System.out.println(result);
    }
}