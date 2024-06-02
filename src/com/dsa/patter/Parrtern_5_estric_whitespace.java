package com.dsa.patter;

public class Parrtern_5_estric_whitespace {
    public static  void printEstricpattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(i>=j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }

    public static  void printEstricpatternReverse(int n){
        for(int i=n;i>=1;i--){
            for(int j=n;j>=1;j--){
                if(i>=j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }









    public static void main(String[] args) {
        printEstricpattern(5);
        printEstricpatternReverse(5);
    }
}

