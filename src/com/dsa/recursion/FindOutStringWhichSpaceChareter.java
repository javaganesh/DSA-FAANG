package com.dsa.recursion;

public class FindOutStringWhichSpaceChareter {
    public static String findStringWhiteSpace(String str){

       if(str.isBlank() || str.isEmpty()){
           return str+"-->";
       }
        StringBuilder sb=new StringBuilder();
       for(int i=0;i< str.length();i++){
           if(!Character.isWhitespace(str.charAt(i))){
             sb.append(str.charAt(i));
           }
       }
       return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(findStringWhiteSpace("         "));
    }
}
