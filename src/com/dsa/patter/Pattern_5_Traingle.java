package com.dsa.patter;

public class Pattern_5_Traingle {
    public static  void printNumbeer(int n){
        for(int i=1;i<n;i++){
            for(int sp=n-1;sp>i;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("\n");
        }
    }
    public static  void printNumbeerspace(int n){
        for(int i=1;i<n;i++){
            for(int sp=n-1;sp>i;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("\n");
        }
    }
    public static  void printNumbeeralpha(int n){
        for(int i=1;i<n;i++){
            for(int sp=n-1;sp>i;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char) (64 +j));
            }
            System.out.println("\n");
        }
    }
    public static  void printNumbeeralphaWithSpace(int n){
        for(int i=1;i<n;i++){
            for(int sp=n-1;sp>i;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(((char) (64 +j))+" ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        printNumbeer(6);
        printNumbeerspace(6);
        printNumbeeralpha(6);
        printNumbeeralphaWithSpace(6);
       // System.out.println((char) 65);
    }
}
