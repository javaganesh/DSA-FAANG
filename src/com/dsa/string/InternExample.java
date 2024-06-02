package com.dsa.string;

public class InternExample {
    public static void main(String[] args) {
        String s1=new String("hello");
        String s2="hello";
        System.out.println(s1==s2);
        String s3=s1.intern();
        System.out.println(s1==s3);
    }
}
