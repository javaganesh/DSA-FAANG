package com.dsa.string;

public class StringCharSequceExampl {
    public static void main(String[] args) {
        String str="Ganesh chandra Parida";
        CharSequence chSequce = str.subSequence(1, 7);
        System.out.println(chSequce.charAt(1));
    }
}
