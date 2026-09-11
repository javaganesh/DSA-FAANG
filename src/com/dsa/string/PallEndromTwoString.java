package com.dsa.string;

public class PallEndromTwoString {

    private static void checkPalindromeUsingTwoPointer(String str) {

        int l = 0;
        int r = str.length() - 1;

        while (l < r) {

            // Skip spaces from left
            while (l < r && Character.isSpaceChar(str.charAt(l))) {
                l++;
            }

            // Skip spaces from right
            while (l < r && Character.isSpaceChar(str.charAt(r))) {
                r--;
            }

            char left = Character.toLowerCase(str.charAt(l));
            char right = Character.toLowerCase(str.charAt(r));

            if (left != right) {

                System.out.println("Not Palindrome");
                System.out.println(left + " != " + right);
                return;

            }

            l++;
            r--;

        }

        System.out.println("Palindrome");

    }

    public static void main(String[] args) {

        String str = "Ma dam";

        checkPalindromeUsingTwoPointer(str);

    }

}