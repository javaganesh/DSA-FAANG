package com.dsa.recursion;

import java.util.Scanner;

public class FloodFilExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] arr= new int[m][n];

        //
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        boolean[][] isVisted=new boolean[m][n];
        floodfill(1,1,arr,"",isVisted);

    }

    private static void floodfill(int row, int col, int[][] arr, String str,  boolean[][] isVisted) {

   if(row<0 || col<0 || row== arr.length || col== arr[0].length
           || arr[row][col]==1 || isVisted[row][col]==true){
       return;
   }
   if(row== arr.length-1 && col==arr[0].length-1){
       System.out.println(str);
   }
   isVisted[row][col]=true;

   floodfill(row-1,col,arr,str+"t",isVisted);
   floodfill(row-1,col,arr,str+"t",isVisted);
   floodfill(row-1,col,arr,str+"t",isVisted);
   floodfill(row-1,col,arr,str+"t",isVisted);
        isVisted[row][col]=false;


    }
}
