package com.dsa.recursion_forLoop;

public class GenerateBinaryString {
    public static void genBinNumber(int box,String ans){
        if(box==2){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<=1;i++){
            genBinNumber(box+1,ans+i);
            System.out.println("---");

        }
    }
    public static void main(String[] args) {
       genBinNumber(0,"");
    }
}
