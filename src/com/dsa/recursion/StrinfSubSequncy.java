package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class StrinfSubSequncy {
    private static void subSq1(String str,String result) {
        if(str.length()==0){
            System.out.print(result+" ");
            return;
        }
        char curChar=str.charAt(0);
        subSq1(str.substring(1),result+curChar);
        subSq1(str.substring(1),result);


    }
    private static List<String> subSq(String str) {
        List<String> res=new ArrayList<>();
        if(str.length()==0){
            res.add(" ");
            return  res;
        }
        char pref=str.charAt(0);
        List<String> smallAns=subSq(str.substring(1));
        for(String st1:smallAns){
            res.add(st1);
            res.add(pref+st1);

        }
        return res;

    }
    public static void main(String[] args) {
        String str="abc";
        List<String> result=subSq(str);
        subSq1(str,"");
       // System.out.println(result);
    }




}
