package com.dsa.hash.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PairSumOf2DMatrix {
    private static void pairSum(int[][] mat, int n, int sum) {
        HashMap<Integer, List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<mat[i].length;j++){
                map.put(mat[i][j], Arrays.asList(i,j));
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<mat[i].length;j++){
                int exitKey = sum - mat[i][j];
                if(map.containsKey(exitKey)){
                    List<Integer> p = map.get(exitKey);
                    int row = p.get(0), col = p.get(1);
                    // If row number of pair is not same as current
                    // row, then print it as part of result.
                    // Second condition is there to make sure that a
                    // pair is printed only once.
                    if (row != i && row > i)
                    {
                        System.out.print("(" + mat[i][j] + "," + mat[row][col] + "), ");
                    }

                }
            }
        }

    }

    public static void main(String[] args) {
        int n = 4, sum = 11;
        int[][] mat = {{1, 3, 2, 4},
                {5, 8, 7, 6},
                {9, 10, 13, 11},
                {12, 0, 14, 15}};
        pairSum(mat, n, sum);
    }


}
