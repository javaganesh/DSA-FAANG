package com.dsa.string;

public class LastIndexOfExample {
    public static void main(String[] args) {
        String str = "This is index of example";
        int index = str.lastIndexOf('s',5);
        System.out.println(index);


        String str2 = "This is last index of example";
        int index2 = str.lastIndexOf("of");
        System.out.println(index);


        String str3 = "This is last index of example";
        int index3 = str.lastIndexOf("of", 25);
        System.out.println(index3);
        index = str.lastIndexOf("of", 10);
        System.out.println(index); // -1, if not found




    }
}
