package com.dsa.recursion.level2_2;

public class RemoveAllOccuranceOfChareter {
    public static void main(String[] args) {
        String str = "banana";
        char ch = 'a';
        System.out.println(removeChar(str,0,ch));
    }

    private static String removeChar(String str, int idx, char ch) {

        if(idx == str.length())
            return "";

        String rem = removeChar(str, idx + 1, ch);

        if(str.charAt(idx) == ch)
            return rem;

        return str.charAt(idx) + rem;
    }
}
