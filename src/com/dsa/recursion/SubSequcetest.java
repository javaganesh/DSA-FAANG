package com.dsa.recursion;

import java.util.ArrayList;

public class SubSequcetest {
    public static ArrayList<String> hetSSQ(String str){
       ArrayList<String> ans=new ArrayList<>();
        if(str.length()==0){
            ans.add(" ");
            return  ans;
        }
        char curr=str.charAt(0);
        ArrayList<String> sm=hetSSQ(str.substring(1));
        for(String s:sm){
            ans.add(s);
            ans.add(curr+s);

        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(hetSSQ("abc"));
    }
}
