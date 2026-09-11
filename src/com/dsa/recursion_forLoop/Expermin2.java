package com.dsa.recursion_forLoop;

public class Expermin2 {
public static  int count;
    public static  void m1(){
        if(count>2){
            return;
        }
        System.out.println("m1->"+count);
        count++;
         m1();
    }
    public static void main(String[] args) {
    for(int i=1;i<=2;i++){

        //System.out.println(i);
        m1();

    }
    }

}
