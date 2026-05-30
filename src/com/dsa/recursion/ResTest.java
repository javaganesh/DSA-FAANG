package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class ResTest {
   private static List<String> ans=new ArrayList<>();
    private static String recSub(String str) {
        if(str.isBlank()){
            return "";
        }
        String small=recSub(str.substring(1));
        System.out.println(str.charAt(0)+"--"+ str.substring(1));
        return ans.toString();



    }
    public static void main(String[] args) {
        String str="Ganesh";
        String ans = recSub(str);
        System.out.println(ans);
    }


}
