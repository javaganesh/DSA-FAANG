package com.dsa.recursion_forLoop;

public class GeneratePassword {
    static char[] letters = {'A', 'B'};
    public static void generatePassowrd(int pos,String ans){
        if(pos==3){
            System.out.println(ans);
            return;
        }

        for(char c:letters){
            generatePassowrd(pos+1,ans+c);
        }
    }
    public static void main(String[] args) {
        generatePassowrd(0,"");
    }
}
