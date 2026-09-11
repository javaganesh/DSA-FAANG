package com.dsa.backTracking1;

public class CountTargetSubsequence {

    static int countSubsequence(
            String str,
            String target,
            int i,
            int j) {

        // Target completely matched
        if (j == target.length()) {
            return 1;
        }

        // Source finished before target
        if (i == str.length()) {
            return 0;
        }

        // Characters match
        if (str.charAt(i) == target.charAt(j)) {

            // TAKE
            int take = countSubsequence(
                    str,
                    target,
                    i + 1,
                    j + 1
            );

            // SKIP
            int skip = countSubsequence(
                    str,
                    target,
                    i + 1,
                    j
            );

            return take + skip;
        }

        // Characters don't match
        return countSubsequence(
                str,
                target,
                i + 1,
                j
        );
    }

    public static void main(String[] args) {

        String str = "rabbbit";
        String target = "rabbit";

        int result =
                countSubsequence(str, target, 0, 0);

        System.out.println(result);
    }
}