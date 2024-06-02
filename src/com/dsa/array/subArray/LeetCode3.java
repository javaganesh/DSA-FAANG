package com.dsa.array.subArray;

import java.util.HashSet;
import java.util.Set;

public class LeetCode3 {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<String> set=new HashSet<>();
       for(int i=0;i<s.length();i++){
           for(int j=i+1;j<s.length();j++){
               String subStr=s.substring(i,j);
                boolean isDuplicate =isDuplicateCharter(subStr);
                  if(isDuplicate==false){
                      set.add(subStr);
                  }
           }
       }
       int max=Integer.MIN_VALUE;
       for(String st:set){
           max=Math.max(max,st.length());
       }

        return max ;
    }

    private static boolean isDuplicateCharter(String subStr) {
        Set<Character> set=new HashSet<>();
        boolean flag=false;

        for(int i=0;i<subStr.length();i++){
            if(set.contains(subStr.charAt(i))){
                flag=true;
                break;
            }
            set.add(subStr.charAt(i));
        }
        return flag;
    }

    public static void main(String[] args) {
   String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
        //System.out.println(isDuplicateCharter("abcdefghjkl"));
    }
}
