package com.dsa.recursion.level2_2;

public class RemoveDigit {
    public static void main(String[] args) {
        String str = "a1b2c3d4";
        System.out.println(removeDigit(str,0));


    }

    private static String  removeDigit(String str,int idx) {
        if(idx==str.length()){
            return "";
        }

        String rm=removeDigit(str,idx+1);
        if(Character.isDigit(str.charAt(idx))){
           return rm;
        }
        return str.charAt(idx)+rm;

    }
}
