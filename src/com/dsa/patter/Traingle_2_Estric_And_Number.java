package com.dsa.patter;

public class Traingle_2_Estric_And_Number {
    public static void printAsstric(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
    public static void printIncNumberFomat(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(i+" ");
            }
            System.out.println("\n");
        }
    }
    public static void printDescrNumberFomat(int n){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("\n");
        }
    }

    public static void printincreTolowtoHighNumberFomat(int n){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("\n");
        }
    }
    public static void printinDecreHighToLowNumberFomat(int n){
        for(int i=1;i<=n;i++){
            for(int j=5;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {

        System.out.println("=====================================================================================");
        printAsstric(6);
        System.out.println("==============================================================================");
        printIncNumberFomat(6);
        System.out.println("=====================================================================================");
        printDescrNumberFomat(6);
        System.out.println("=====================================================================================");
        printincreTolowtoHighNumberFomat(6);
        System.out.println("==========================================================================");
        printinDecreHighToLowNumberFomat(6);
        System.out.println("=====================================================================================");
    }
}
