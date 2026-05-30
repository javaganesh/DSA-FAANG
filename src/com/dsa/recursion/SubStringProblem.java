package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubStringProblem {
    //private static List<String> ansList=new ArrayList<>();
    private  static List<String> substringproblem(String str) {
        List<String> ansList = new ArrayList<>();
        if(str.isBlank()){
            //ansList=new ArrayList<>();
            ansList.add("");
            return ansList;
        }
       List<String> small =substringproblem(str.substring(1));
        ansList.addAll(small);
        for(String s:small){
            ansList.add(str.charAt(0)+s);
        }
        return ansList;

    }
    public static void main(String[] args) {
        String str="abc";
         List<String> result=substringproblem(str);
        System.out.println(result);

    }


}
