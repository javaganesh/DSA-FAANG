package com.dsa.patter;

public class Star_1_Tringle {
    public static void trangleStart(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void trangleNumber(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
    public static void trangleConsNumber(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    public static void trangleAccending(int n){
        for(int i=1;i<=n;i++){
            for(int j=5;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    public static void trangleRevNumber(int n){
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
    public static void trangleRevNumberDecreasing(int n){
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
    public static void trangleRevNumberDecreasingElemnt(int n){
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
    public static void trangleRevNumberDecreasingRowWise(int n){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        trangleStart(6);
        System.out.println(" \n");
        trangleNumber(6);
        System.out.println(" \n");
        trangleConsNumber(6);
        System.out.println(" \n");
        trangleRevNumber(6);
        System.out.println(" \n");
        trangleAccending(6);
        System.out.println("\n ");
        trangleRevNumberDecreasing(6);
        System.out.println("\n");
        trangleRevNumberDecreasingElemnt(6);
        System.out.println("\n");
        trangleRevNumberDecreasingRowWise(6);

    }

}
