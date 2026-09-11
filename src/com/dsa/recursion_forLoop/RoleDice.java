package com.dsa.recursion_forLoop;

public class RoleDice {
    public static  void generatedies(int dies,String roll){
        if(dies>=2){
            System.out.println(roll);
            return;
        }

        for(int i=1;i<=6;i++){
            generatedies(dies+1,roll+i);
        }
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        generatedies(0,"");
    }
}
