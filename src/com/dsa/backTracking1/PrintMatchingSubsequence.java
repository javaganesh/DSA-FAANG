package com.dsa.backTracking1;

public class PrintMatchingSubsequence {

    static void findSubsequence(
            String str,
            String target,
            int i,
            int j) {

        // Target completely matched
        if (j == target.length()) {
            System.out.println(target);
            return;
        }

        // Source finished
        if (i == str.length()) {
            return;
        }

        // Characters match
        if (str.charAt(i) == target.charAt(j)) {

            // TAKE
            findSubsequence(
                    str,
                    target,
                    i + 1,
                    j + 1
            );

            // SKIP
            findSubsequence(
                    str,
                    target,
                    i + 1,
                    j
            );

        } else {

            // Characters don't match → SKIP
            findSubsequence(
                    str,
                    target,
                    i + 1,
                    j
            );
        }
    }

    public static void main(String[] args) {

        String str = "bab";
        String target = "b";

        findSubsequence(
                str,
                target,
                0,
                0
        );
    }
}