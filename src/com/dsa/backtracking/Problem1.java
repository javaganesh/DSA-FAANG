package com.dsa.backtracking;

public class Problem1 {
    public static void main(String[] args) {
        int row=2;
        int col=2;
        int tatalWays=way(1,1,row,col);
        System.out.println(tatalWays);


    }

    private static int way(int sr, int sc, int trow, int tcol) {
        if(sr>trow || sc>tcol){
            return 0;
        }
        if(sr==trow || sc==tcol){
            return 1;
        }
        int downWays=way(sr+1,sc,trow,tcol);
        int rightWays=way(sr,sc+1,trow,tcol);
        return downWays+rightWays;

    }
}
