package com.dsa.string;

public class SerachString {
    public static void main(String[] args) {
        // is to be searched
        String str
                = "GeeksforGeeks is a computer science portal";
        System.out.println(str.indexOf('k'));
        System.out.println(str.lastIndexOf('k'));
        System.out.println(str.lastIndexOf("po"));
        System.out.println(str.indexOf("Geeks"));
        System.out.println(str.lastIndexOf("Geeks"));


    }
}
