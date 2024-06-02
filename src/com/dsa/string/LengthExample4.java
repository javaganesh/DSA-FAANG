package com.dsa.string;

public class LengthExample4 {
    public static void main(String[] args) {
        String str = " Welcome To JavaTpoint ";
        int sizeWithWhiteSpaces = str.length();

        System.out.println("In the string: " + "'" + str + "'");
        str.replace(" ","");
        System.out.println(str.length());
    }

}
