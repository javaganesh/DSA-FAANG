package com.dsa.string;

import java.util.*;

public class LongestSuBStringProblem {

    private static int loggestSubstring(String str) {
       if(str.isEmpty()) return 0;
       if(str.length()==1) return 1;

    int left=0;
    int right=0;
    int ans=0;
    Set<Character> set=new HashSet<>();
    while(right<str.length()){

        char ch=str.charAt(right);
        while(set.contains(ch)){
            set.remove(str.charAt(left));
            left++;

        }
        set.add(ch);
        ans=Math.max(ans,right-left+1);
        right++;
    }
   return ans;

    }
    public static void main(String[] args) {
        String str="abcbaababca";
       int result =loggestSubstring(str);
        System.out.println(result);
    }


}
