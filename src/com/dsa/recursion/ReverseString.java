package com.dsa.recursion;

public class ReverseString {
    public static  String revderseString(String input){
        if(input.equals("")){
            return  "";

        }
        return revderseString(input.substring(1)) + input.charAt(0);

    }
    public static void main(String[] args) {
        System.out.println(revderseString("Ganesh"));
    }
}
