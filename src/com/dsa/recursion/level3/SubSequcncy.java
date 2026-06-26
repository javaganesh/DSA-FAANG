package com.dsa.recursion.level3;


import java.util.ArrayList;
import java.util.List;

public class SubSequcncy
{

    private static List<String> getSubsequences(String str, int idx) {

        // Base Condition
        if (idx == str.length()) {

            List<String> base = new ArrayList<>();
            base.add("");

            return base;
        }

        // Faith
        List<String> rem = getSubsequences(str, idx + 1);

        // Self Work
        List<String> ans = new ArrayList<>();

        // Choice 1: Don't take the current character
        ans.addAll(rem);

        // Choice 2: Take the current character
        for (String s : rem) {
            ans.add(str.charAt(idx) + s);
        }

        return ans;
    }

    public static void main(String[] args) {

        String str = "ABC";

        List<String> ans = getSubsequences(str, 0);

        System.out.println(ans);
    }
}