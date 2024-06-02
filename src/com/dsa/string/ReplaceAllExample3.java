package com.dsa.string;

public class ReplaceAllExample3 {
    public static void main(String[] args) {
        String s1="My name is Khan. My name is Bob. My name is Sonoo.";
        String resul="";
        int i=0;
       do{
            if(!Character.isSpaceChar(s1.charAt(i))){
                resul+=s1.charAt(i);
            }
            i++;
        } while (i<s1.length());
        System.out.println(s1);
        System.out.println(s1.replaceAll("\s",""));
        System.out.println(resul);
    }
}
