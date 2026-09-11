package com.dsa.recursion_forLoop;

public class Tiny {
   public static void  solve(int level, String ans) {
        if (level == 2) {
            System.out.println(ans);
            return;
        }
        for (int i = 1; i <= 2; i++) {
            System.out.println("start loop:"+i+ " its level :"+level);
            System.out.println("pause loop for calling solve() :"+i);
            solve(level + 1, ans + i);
            System.out.println("loop resume:"+i);
      }

    }
    public static void main(String[] args) {
        solve(0,"");
    }
}
