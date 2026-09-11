package com.dsa.recursion_forLoop;

import java.util.ArrayList;
import java.util.List;

public class ChooseChocklet {
    public static String[] str={"kitkat","Dry-Milk","Five-Star"};
    private static void solve(int level, int start,String[] str,List<String> ansList) {

       /* if(level==2){
            System.out.println(ansList);
            return;
        }*/
        System.out.println(ansList);
        for(int i=start;i<str.length;i++){
            ansList.add(str[i]);
            solve(level+1,i+1,str,ansList);
            ansList.remove(ansList.size()-1);
        }
    }

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        solve(0,0,str,list);
    }



}
