package com.dsa.recursion.level3;

public class PerMutetation {
    public static void main(String[] args) {
        String str="abc";
        generate(str,"");

    }

    private static void generate(String str,String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++){

            char currentChar=str.charAt(i);
            String rem=str.substring(0,i)+str.substring(i+1);
            generate(rem,ans+currentChar);
        }
    }
}
