package com.dsa.recursion;

public class RemoveChaterinString {
    private static String removeCharter(String str) {
        if(str.length()==0){
            return "";
        }
        String ans=removeCharter(str.substring(1));
        char c=str.charAt(0);
        if(c!='a'){
            return  c+ans;
        }
        else {
            return ans;
        }


    }

    public static void main(String[] args) {
        String str="Ganesh Parida";
       String res =removeCharter(str);
        System.out.println(res);
    }


}
