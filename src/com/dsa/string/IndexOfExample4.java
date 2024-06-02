package com.dsa.string;

public class IndexOfExample4 {
    public static void main(String[] args) {

        String s1 = "This is indexOf method";
        // Passing char and index from
        int index = s1.indexOf('e', 12); //Returns the index of this char
        System.out.println("index of char "+index);


        String str = new String("Welcome to JavaTpoint.");
        String str1 = new String("Welcome to JavaTpoint");
        System.out.println(str1 == str);

    }
}
