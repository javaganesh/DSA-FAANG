package com.dsa.backtracking;

public class SkipCharterA {
    public static void main(String[] args) {
        String str="bacdfahjklafg";
        skipA(str,"");
    }

    private static void skipA(String unp, String pr) {
        if(unp.isBlank()){
            System.out.println(pr);
            return;
        }
        if(unp.charAt(0)=='a'){
            skipA(unp.substring(1),pr);
        }
        else {
            skipA(unp.substring(1),pr+unp.charAt(0));
        }
    }

    private static void skipApple(String unp, String pr) {
        if(unp.isBlank()){
            System.out.println(pr);
            return;
        }
        if(unp.charAt(0)=='a'){
            skipA(unp.substring(1),pr);
        }
        else {
            skipA(unp.substring(1),pr+unp.charAt(0));
        }
    }



}
