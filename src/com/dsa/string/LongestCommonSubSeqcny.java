package com.dsa.string;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonSubSeqcny {
    public static int longestCommenSubsequnce(String s1,String s2){
       int count=0;
        Set<Character> set=new HashSet<>();
               for(int i=0;i<s1.length();i++){
                   if(s2.contains(Character.toString(s1.charAt(i)))){
                       set.add(s1.charAt(i));
                   }
               }
        return set.size();
    }
    public static void main(String[] args) {
        String  s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        System.out.println(longestCommenSubsequnce(s1,s2));
        System.out.println(longestCommenSubsequnce("BD","ABCD"));
    }

}
