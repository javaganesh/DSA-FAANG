package com.dsa.recursion;

public class PallendromCheck {
    private static boolean pallendrom(String str, int start, int end) {
     if(start==end){
         return true;
     }
     return str.charAt(start)== str.charAt(end) && pallendrom(str,start+1,end-1);

    }
    public static void main(String[] args) {
        String str="radar";
        boolean check=pallendrom(str,0,str.length()-1);
        System.out.println(check);
    }




}
