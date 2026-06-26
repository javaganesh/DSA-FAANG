package com.dsa.recursion.level2_2;

public class CheckStringPallendromOrnot {
    public static void main(String[] args) {
        String str="radar";
        System.out.println(checkPal(str,0,str.length()-1));

    }

    private static boolean checkPal(String str, int left, int right) {

        if(left >= right)
            return true;

        if(str.charAt(left) != str.charAt(right))
            return false;

        return checkPal(str, left + 1, right - 1);
    }
}
