package com.dsa.recursion_forLoop;

import java.util.ArrayList;
import java.util.List;

public class BoXProblem {
    public static void fillBox(int box, String ans){
        if(box==2){
            System.out.println(ans);
            return;
        }

        for(char c='A';c<='B';c++){

            fillBox(box+1,ans+c);

        }
        System.out.println(" ------------");
    }
    public static void main(String[] args) {
        fillBox(0,"");
    }
}
