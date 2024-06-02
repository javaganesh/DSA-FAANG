package com.dsa.patter;

public class PrintCornerrPattern {
    public static void printCornerPrint(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i == j){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void printCornerPrint_with_hash_sysmbol(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i == j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("# ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        printCornerPrint(6);
        System.out.println();
        printCornerPrint_with_hash_sysmbol(6);


    }
}
