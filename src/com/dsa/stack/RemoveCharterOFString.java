package com.dsa.stack;

import java.util.Stack;

public class RemoveCharterOFString {
    public static void main(String[] args) {
        String st1 = "computer";
        String st2 = "cat";

   for(int i=0;i<st2.length();i++){
        char ch = st2.charAt(i);
        while(st1.contains(ch+"")){
            st1.replaceAll((ch + ""),"");

        }

   }
   System.out.println(st1);

    }




    }

