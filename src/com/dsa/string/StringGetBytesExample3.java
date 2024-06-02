package com.dsa.string;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "Welcome to JavaTpoint.";
        System.out.println("The input String is : ");
        System.out.println(str + "\n");

        byte[] byteArr = str.getBytes("UTF-16");
        System.out.println("After converted into UTF-16 the String is : ");
    }
}
