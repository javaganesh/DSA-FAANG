package com.dsa.recursion.level2_2;

public class ReverseString {
    public static void main(String[] args) {
          String str = "Ganesh";
        System.out.println(reverseStr(str,0));

    }

    private static String reverseStr(String str, int idx) {

        if(idx == str.length())
            return "";

        String rem = reverseStr(str, idx + 1);

        return rem + str.charAt(idx);
    }
}
