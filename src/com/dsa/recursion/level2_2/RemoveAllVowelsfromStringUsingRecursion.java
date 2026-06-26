package com.dsa.recursion.level2_2;

public class RemoveAllVowelsfromStringUsingRecursion {
    public static void main(String[] args) {
        String str = "education";
        System.out.println(removelVowel(str,0));
    }

    private static String removelVowel(String str, int idx) {

        if(str.length() == idx){
            return "";
        }

        String rmStr = removelVowel(str, idx + 1);

        if(isVowel(str, idx)){
            return rmStr;
        }

        return str.charAt(idx) + rmStr;
    }

    private static boolean isVowel(String str, int idx) {
        return str.charAt(idx) == 'a' ||
                str.charAt(idx) == 'e' ||
                str.charAt(idx) == 'i' ||
                str.charAt(idx) == 'o' ||
                str.charAt(idx) == 'u';
    }
}
