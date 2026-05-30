package com.dsa.backtracking;

import java.util.ArrayList;
import java.util.List;

public class StringPermitation {
    private static void permituation(String str, String res, List<String> list) {
        if(str.length()==0){
            list.add(res);
            return;
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            String remaing=left+right;
            permituation(remaing,res+c,list);

        }
    }
    public static void main(String[] args) {
        String str="abc";
        List<String> list=new ArrayList<>();
        permituation(str,"",list);
        for(String s:list){
            System.out.print(s+" ");
        }
    }


}
