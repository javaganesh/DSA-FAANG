package com.dsa.recursion.level2_2;

public class CountVowel {
    public static void main(String[] args) {
        String str = "education";
        System.out.println(countVowel(str,0));

    }
    private static int countVowel(String str, int idx) {

        if(str.length() == idx){
            return 0;
        }

        int rmStr = countVowel(str, idx + 1);

        if(isVowel(str, idx)){
            return 1+rmStr;
        }

        return  rmStr;
    }

    private static boolean isVowel(String str, int idx) {
        return str.charAt(idx) == 'a' ||
                str.charAt(idx) == 'e' ||
                str.charAt(idx) == 'i' ||
                str.charAt(idx) == 'o' ||
                str.charAt(idx) == 'u';
    }
}
