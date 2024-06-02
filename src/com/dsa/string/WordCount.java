package com.dsa.string;

public class WordCount {
    public static void main(String[] args) {
        String str="Welcome to java World";
        String[] strArray = str.split(" ");
        System.out.println("Word Count"+strArray.length);
        int spaceCount=0;
        for(int i=0;i<str.length();i++){
            if(Character.isSpaceChar(str.charAt(i))){
                spaceCount++;
            }
        }
        System.out.println("Space Count:"+spaceCount);


    }
}
