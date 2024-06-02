package com.dsa.string;

public class ReverseStringWord {
    private static String reverseWords(String str) {
        int size=str.length();
        char[] c=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        int i=size;
        while(i>0){
            if(c[i] =='.'){
                int r=size-i;
                sb.append(str.substring(i,r));
                sb.append(".");


            }
           i--;

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="I.like.Java.program";
        String reversWord=reverseWords(str);
        System.out.println(reversWord);
    }


}
