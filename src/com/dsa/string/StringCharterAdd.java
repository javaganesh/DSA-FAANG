package com.dsa.string;

public class StringCharterAdd {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int chars[] = { 1, 5, 7, 9 };
        String ans = addStars(str, chars);

        // Printing the resultant string
        System.out.println(ans);
    }

    private static String addStars(String str, int[] chars) {

// Create a string ans for storing
        // resultant string
        String ans = "";

        int j = 0;
        for (int i = 0; i < str.length(); i++) {

            if (j < chars.length && i == chars[j]) {
                ans += '*';
                j++;
            }
            ans += str.charAt(i);
        }

        return ans;
    }
}
