package com.dsa.recursion;

import java.util.Scanner;

public class PrintMazePathwithJumps {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m= scanner.nextInt();;
        int n= scanner.nextInt();;
        printMazePathwithJumps(1,1,m,n,"");

    }

    private static void printMazePathwithJumps(int sr, int sc, int dr, int dc, String str) {

        if(sc==dc && sr==dr){
            System.out.println(str);
            return;
        }

       for(int ms=1;ms<dc-sc;ms++){
           printMazePathwithJumps(sr, sc+ms, dr, dc, str+"h");

       }

       for (int ms=1;ms<dr-sr;ms++){
           printMazePathwithJumps(sr+ms, sc, dr, dc, str+"V");

       }
        for (int ms=1;  ms<dc-sc && ms<dr-sr;ms++){
            printMazePathwithJumps(sr+ms, sc+1, dr, dc, str+"D");

        }



    }

}
