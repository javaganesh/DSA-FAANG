package com.dsa.whileloop;

public class PrintPattern {
    public static void main(String[] args) {
        /*
                1
                2 3
                4 5 6
                7 8 9 10
         */
        int i=1;
        int cnt=1;
        while(i<=4){
            int c=1;

            while (c++<=i){
                System.out.print(cnt+" ");
                cnt++;

            }
            System.out.println();
            i++;
        }
    }
}
