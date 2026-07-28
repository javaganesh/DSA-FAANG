package com.dsa.recursion_forLoop;

public class Experiment {
    private static void test1(int level) {
        if(level==2) return;

        for(int i=1;i<=2;i++) {
            System.out.println("loop:" + i);
            test1(level + 1);
            System.out.println("loop end "+" current level :"+level);
        }

    }
    public static void main(String[] args) {
        /*for(int i=0;i<=2;i++) {
            test1();
        }*/
        test1(0);
    }


}
