package com.dsa.recursion;

public class CheckStringIsPallenDromOrNot {
    public static void main(String[] args) {
        String str = "RADAR";
        checkplanedromeOrNot(str);
    }

    private static boolean checkplanedromeOrNot(String input) {
        if (input.length() == 0 || input.length() == 1) {
            return true;
        }

        if (input.charAt(0) == input.charAt(input.charAt(input.length() - 1))) {

            return checkplanedromeOrNot(input.substring(1, input.length() - 1));
        }
        return false;
    }
}
