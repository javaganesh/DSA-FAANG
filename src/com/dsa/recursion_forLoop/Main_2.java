package com.dsa.recursion_forLoop;

public class Main_2 {
    private static void test(int level) {
           if(level==2) return;
        for(int i=0;i<=2;i++){
            System.out.println("i->"+i);
            test(level+1);
        }
    }
    public static void main(String[] args) {
        test(0  );
    }


}
