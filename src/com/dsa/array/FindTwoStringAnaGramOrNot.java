package com.dsa.array;

import java.util.Arrays;

public class FindTwoStringAnaGramOrNot {
    public static void main(String[] args) {
        System.out.println( checkTwoStriAnaGramorNot("tas","sts"));

    }

    private static boolean checkTwoStriAnaGramorNot(String s, String t) {

        if(s.length()!=t.length()) return false;
        int[] freq=new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        System.out.println(Arrays.toString(freq));
         for(int c:freq){
             if(c!=0) return false;
         }

        return  true;
    }
}
