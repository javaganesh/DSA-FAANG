package com.dsa.array;

import java.util.Scanner;

public class SprialMatriuix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int minrow=0;
        int mincol=0;
        int maxrow= arr.length-1;
        int maxcol=arr[0].length-1;

        while(true){
            for(int i=minrow,j=mincol;i<=maxrow;i++){
                System.out.println(arr[i][j]);
            }
            mincol++;
            for(int i=maxrow,j=mincol;i<=maxcol;j++){
                System.out.println(arr[i][j]);
            }
            maxrow--;

            for(int i=maxrow,j=mincol;i>=minrow;i--){
                System.out.println(arr[i][j]);
            }
            maxcol--;

            for(int i=maxrow,j=maxcol;j>=mincol;j--){
                System.out.println(arr[i][j]);
            }
        minrow++;

        }







    }
}
