package com.dsa.recursion;

import java.util.Scanner;

public class MazePathPrintReCursion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m= scanner.nextInt();;
        int n= scanner.nextInt();;


        printMzrzePath(1,1,m,n,"");

    }

    private static void printMzrzePath(int sr, int sc, int dr, int dc, String pcf) {
        if(sr> dr || sc>dc){
            return;
        }
        if(sr== dr && sc==dc){
            System.out.println(pcf);
            return;
        }
        printMzrzePath(sr,sc+1,dr,dc,pcf+"h");
        printMzrzePath(sr+1,sc,dr,dc,pcf+"V");


    }

}
