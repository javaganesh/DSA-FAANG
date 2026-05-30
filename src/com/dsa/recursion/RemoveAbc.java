package com.dsa.recursion;

public class RemoveAbc {
    private static String removeM(String str) {
            if(str.length()==0){
                return "";
            }

        String ans="";
        String small=removeM(str.substring(1));


            if(str.charAt(0)!='m'){
                ans=str.charAt(0)+small;
            }
            return ans ;
    }

    public static void main(String[] args) {
        String str="mabacmdfm";
        System.out.println(str  );
        System.out.println(  removeM(str));
    }


}
