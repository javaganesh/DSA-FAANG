package com.dsa.patter;

public class Pattern_7_All_Side_corner {
    public static void printAllSideofRectangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n  ){
                    System.out.print("*");

                }
                else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printAllSideofRectangle(7);
    }
}
