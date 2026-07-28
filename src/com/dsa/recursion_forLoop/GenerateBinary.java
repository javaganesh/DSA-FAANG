package com.dsa.recursion_forLoop;

public class GenerateBinary {
    private static void generateBinary(int level, String ans) {
         if(level==2){
             System.out.println(ans);
             return;
         }

        for(int i=0;i<=1;i++){
            generateBinary(level+1,ans+i);

        }

    }


    public static void main(String[] args) {
        generateBinary(0,"");
    }



}
