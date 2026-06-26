package com.dsa.recursion.level3;

public class PermutationOFString {
    public static void main(String[] args) {
        permutation("ABC", "");
    }

    private static void   permutation(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char current=str.charAt(i);

            String rmStr=str.substring(0,i)+str.substring(i+1);
            permutation(rmStr,ans+rmStr);

        }


    }
}
