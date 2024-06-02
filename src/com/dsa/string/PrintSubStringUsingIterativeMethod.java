package com.dsa.string;

import java.util.ArrayList;
import java.util.List;

public class PrintSubStringUsingIterativeMethod {
    public static void main(String[] args) {
        String str="abc";
        String str2="gfg";

        //printSubstring(str2);
        int count=printSubstringCheckItContaineGivenStringOrNot("banana","ban");
        System.out.println(count);
    }

    private static void printSubstring(String str) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<str.length();i++){
         for(int j=i+1;j<=str.length();j++){
           list.add(str.substring(i,j));
         }
     }
        System.out.println(list);
    }

    private static int printSubstringCheckItContaineGivenStringOrNot(String str,String t) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                list.add(str.substring(i,j));
            }
        }
        int count=0;
        System.out.println(list);
        for(String s:list){
            if(s.contains(t)){
                count++;
            }
        }
        return count;
    }
}
