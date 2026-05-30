package com.dsa.backtracking;

public class RateInDeadmaze {
    private static void printMaze(int sr, int sc, int er, int ec, String res, int[][] maze,boolean[][] isVisited) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(res);
            return;
        }
        if(maze[sr][sc]==0) return;
        if(isVisited[sr][sc]==true) return;
        isVisited[sr][sc]=true;
        //go right
        printMaze(sr,sc+1,er,ec,res+"R",maze,isVisited);
        //goes down
        printMaze(sr+1,sc,er,ec,res+"D",maze,isVisited);
        printMaze(sr,sc-1,er,ec,res+"L",maze,isVisited);
        printMaze(sr-1,sc,er,ec,res+"U",maze,isVisited);
        isVisited[sr][sc]=false;
    }

    public static void main(String[] args) {
        int row=4;
        int col=6;
        int[][] maze={{1,0,1,1,1,1},
                      {1,1,1,1,0,1},
                       {0,1,1,1,1,1},
                       {0,0,1,0,1,1}};
        boolean[][] isVisited=new boolean[row][col];
        printMaze(0,0,row-1,col-1,"",maze,isVisited);

    }


}
