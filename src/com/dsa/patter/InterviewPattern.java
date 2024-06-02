package com.dsa.patter;

public class InterviewPattern {
    public static void printStar(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i==(n/2)+1) || (j==(n/2)+1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void printStar_And_Hash(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i==(n/2)+1) || (j==(n/2)+1)){
                    System.out.print("*");
                }
                else {
                    System.out.print("#");
                }
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        printStar(5);
        System.out.println(" ");
        printStar_And_Hash(5);
    }

}
