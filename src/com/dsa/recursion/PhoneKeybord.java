package com.dsa.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneKeybord {
    public  static String[] codes ={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //String str=scanner.next();
        String str="789";

        ArrayList<String> words=getKPC(str);
        System.out.println(words);

    }

    private static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch=str.charAt(0);
        ArrayList<String> ros=getKPC(str.substring(1));
        ArrayList<String> mres=new ArrayList<>();
        String codeForch=codes[ Character.getNumericValue(ch)];
        for(int i=0;i<codeForch.length();i++){
            char c=codeForch.charAt(i);
             for(String s:ros){
                 mres.add(c+s);
             }

        }
        return mres;


    }
}
