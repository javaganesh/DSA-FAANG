package com.dsa.string;

public class LongestCommomnSubString {

    private static String
    findLongestPrefix(String[] strArry) {
        String prefix=strArry[0];

        for(int i=0;i< strArry.length;i++){

            while(strArry[i].indexOf(prefix)!=0){
                 prefix=prefix.substring(0,prefix.length()-1);
                 if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] strArry={"abcd","abcdef","abcrtt","abryd"};
        System.out.println(  findLongestPrefix(strArry));


    }


}
