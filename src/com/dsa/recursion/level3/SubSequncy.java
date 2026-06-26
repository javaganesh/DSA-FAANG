package com.dsa.recursion.level3;

import java.util.ArrayList;
import java.util.List;

public class SubSequncy {
    private  static List<String> list=new ArrayList<>();
    public static void main(String[] args) {
        String str="abc";
       subsequence(str,0,"");
      List<String>  subsequence=subsequence1(str,0);
        System.out.println(subsequence);
    }

    private static List<String> subsequence1(String str, int idx) {

        if(idx==str.length()){
            List<String> basList=new ArrayList<>();
            basList.add("");
            return basList;
        }

        List<String> rmList=subsequence1(str,idx+1);

        List<String> ans = new ArrayList<>();
        // Choice 1: Don't take the current character
        ans.addAll(rmList);

        // Choice 1: take the current character
        for(String s:rmList){
            ans.add(s.charAt(idx)+s);
        }


        return ans;
    }

    private static void subsequence(String str, int idx, String ans) {

        if(idx == str.length()) {
            System.out.println(ans);
            return;
        }

        // Include current character
        subsequence(str, idx + 1, ans + str.charAt(idx));

        // Exclude current character
        subsequence(str, idx + 1, ans);
    }
}
