package com.dsa.recursion;

public class TOFHP {
    public static void main(String[] args) {
        int n=3;
        toh(n, 'a', 'c', 'b');
    }

    private static void toh(int n, char a, char c, char b) {
        if (n == 0) {
            return;
        }
        else{

            toh(n-1,a,b,c);
            System.out.println("Move disk " + n + " from rod "
                    + a + " to rod "
                    + c);
            toh(n,a,c,b);
        }
    }
}
