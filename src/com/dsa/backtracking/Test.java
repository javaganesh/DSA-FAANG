package com.dsa.backtracking;

public class Test {
    public static void main(String[] args) {
        String str="Ganesh";
        for(int i=0;i<str.length();i++){
            System.out.println(str.substring(0,i)+"k->"+str.substring(i,str.length()));
        }
    }
}
