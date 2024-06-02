package com.dsa.string;

import java.util.ArrayList;
import java.util.List;

public class SubStringInProblem {
    public static void main(String[] args) {
        String str="leetCode";
        StringBuilder sb=new StringBuilder(str);
        StringBuilder rev = sb.reverse();
        String strrev =rev.toString();

        List<String> list = permituationOfStringoflentgth2(str);
        checkRevContaineSubstringOrNOt(strrev, list);
      //  System.out.println(list);
    }

    private static void checkRevContaineSubstringOrNOt(String strrev, List<String> list) {
        for(String s: list){
            if(strrev.contains(s)){
                System.out.println(s);
                break;
            }
        }
    }

    private static List<String> permituationOfStringoflentgth2(String str) {
        List<String> list=new ArrayList<>();
        for(int i = 0; i< str.length()-1; i++){
            for(int j=i+2;j<=i+2;j++){
                list.add(str.substring(i,j));
            }
        }
        return list;
    }
}
