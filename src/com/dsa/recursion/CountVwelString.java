package com.dsa.recursion;

public class CountVwelString {
    private static int countVowel(String str, int idx) {

        if(idx==str.length()){
            return 0;
        }
        if(str.charAt(idx)=='a' ||str.charAt(idx)=='e'||str.charAt(idx)=='i'||str.charAt(idx)=='o'||str.charAt(idx)=='u'){
            return 1+countVowel(str,idx+1);
        }
        return countVowel(str,idx+1);
    }

    public static void main(String[] args) {
        String str="Ganesh";
       int count =countVowel(str,0);
        System.out.println(count);
    }


}
