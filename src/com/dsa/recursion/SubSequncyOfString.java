package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequncyOfString {
    public static void main(String[] args) {
        String str="abc";
        List<String> list=getSS(str);
        System.out.println(list);
    }

    private static ArrayList<String> getSS(String str) {
        if(str.length()==0){
            ArrayList<String> lis=new ArrayList();
            lis.add("");
            return lis;
        }

        char c=str.charAt(0);
        ArrayList<String> sublist=getSS(str.substring(1));
        ArrayList<String> res=new ArrayList<>();
        for(String s:sublist){
            res.add(""+ s);
            res.add(c+ s);

        }
        return res;



    }
}
