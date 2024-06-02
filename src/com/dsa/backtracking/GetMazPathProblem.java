package com.dsa.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetMazPathProblem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int n= scanner.nextInt();

        ArrayList<String> paths=getMazePaths(1,1,m,n);
        System.out.println(paths);

    }

    private static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if(sr==dr && sc==dc){
            ArrayList<String> br=new ArrayList<>();
            br.add("");
            return br;
        }
        ArrayList<String> paths=new ArrayList<>();
        //horizontal moves
        for(int ms=1;ms<dc-sc;ms++){
            List<String> hpaths=getMazePaths(sr,sc+ms,dr,dc);
            for(String hpath:hpaths){
                paths.add("h"+ ms+hpath);
            }
        }

        //vertical moves
        for(int ms=1;ms<dr-sr;ms++){
            List<String> vpaths=getMazePaths(sr+ms,sc,dr,dc);
            for(String vpath:vpaths){
                paths.add("d"+ ms+vpath);
            }
        }

     return paths;
    }
}
