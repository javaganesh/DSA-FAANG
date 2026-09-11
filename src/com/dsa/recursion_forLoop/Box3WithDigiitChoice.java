package com.dsa.recursion_forLoop;

public class Box3WithDigiitChoice {
    public static  void fill(int box,String ans){
        if(box>=3){
            System.out.println(ans);
            return;
        }

        for(int digit=0;digit<=1;digit++){


            fill(box+1,ans+digit);
        }
    }
    public static void main(String[] args) {
        fill(0,"");
    }
}
