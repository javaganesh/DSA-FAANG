package com.dsa.array.subArray;

import java.util.HashMap;
import java.util.Map;

public class LeetCode5 {
    public String longestPalindrome(String s) {
        HashMap<String, Integer> map = new HashMap();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String sb = s.substring(i, j);
                if (checkIsPallendromOrNot(sb) == true) {
                    map.put(sb, sb.length());
                }
            }
        }
        String ans="";
        int maxVal = Integer.MIN_VALUE;
        for (Map.Entry entry : map.entrySet()) {
            Integer value = (Integer) entry.getValue();
              String key =(String) entry.getKey();
            if(maxVal <value){
               maxVal=value;
               ans=key;

           }
        }

    return ans;
}
    public boolean checkIsPallendromOrNot(String s){
        StringBuilder sb=new StringBuilder(s);
       boolean flag= sb.reverse().toString().equals(s);
       return flag;
    }
    public static void main(String[] args) {
      LeetCode5 l5=new LeetCode5();
        System.out.println(l5.longestPalindrome("babad"));
    }
}
