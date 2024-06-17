package com.dsa.recursion;

public class PrintSubSequncy {
    public static void main(String[] args) {
        printSubSequncy("","abc");
    }

    private static void printSubSequncy(String p, String str) {
    if(str.isEmpty()){
        System.out.println(p);
        return;
    }
    printSubSequncy(p+str.charAt(0),str.substring(1));
        printSubSequncy(p,str.substring(1));

    }
}
