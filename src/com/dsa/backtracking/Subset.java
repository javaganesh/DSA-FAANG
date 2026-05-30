package com.dsa.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        String str="abc";
        List<List<Integer>> list=new ArrayList<>();
        printSubSet(str,"",list);

    }

    private static void printSubSet(String un,String pr,List<List<Integer>> list) {
        List<Character> li=new ArrayList<>();
        if(un.isBlank()){
            System.out.println(pr);


            return;
        }

        char c=un.charAt(0);
       ;
        printSubSet(un.substring(1),pr+c,list);
        printSubSet(un.substring(1),pr,list);


    }

}
