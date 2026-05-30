package com.dsa.backtracking;

public class MazePath {
    private static int maz(int sr, int sc, int er, int ec) {
        if(sr>er || sc>ec) return  0;
        if(sr==er && sc==ec) return 1;
        int dowway=maz(sr+1,sc,er,ec);
        int righWays=maz(sr,sc+1,er,ec);

        return dowway+righWays;

    }
    private static void print(int sr, int sc, int er, int ec,String s,boolean[][] isvisted) {
     if(sr>er || sc>ec) return ;
     if(sr<0 || sc>ec) return;
     if(isvisted[sr][sc]==true) return;
     if(sr==er && sc==ec){
         System.out.println(s);
         return;
     }
     isvisted[sr][ec]=true;
     print(sr,sc+1,er,ec,s+"R",isvisted);
     //moving down
     print(sr+1,sc,er,ec,s+"D",isvisted);
     //moving left
     print(sr,sc-1,er,ec,s+"L",isvisted);
     //moving Up
     print(sr-1,sc,er,ec,s+"U",isvisted);
     isvisted[sr][sc]=false;


    }


        public static void main(String[] args) {
        int row=3;
        int col=3;
        int ways=maz(1,1,row,col);
     //   System.out.println("ways:"+ways);
              boolean[][] visted=new boolean[row][col];

            print(1,1,row,col,"",visted);


    }


}
