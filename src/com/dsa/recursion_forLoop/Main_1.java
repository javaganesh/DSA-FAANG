package com.dsa.recursion_forLoop;

public class Main_1 {
    void solve(int level) {
       // System.out.println("-level-:"+level);
        if (level == 2)
            return;

        for (int i = 1; i <= 2; i++) {

            System.out.println("Choice " + i);
            System.out.println("level " + level);

            solve(level + 1);
        }
    }
    public static void main(String[] args) {
        Main_1 main_1=new Main_1();
        main_1.solve(0);
    }
}
