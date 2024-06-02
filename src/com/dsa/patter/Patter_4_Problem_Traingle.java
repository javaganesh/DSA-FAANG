package com.dsa.patter;

public class Patter_4_Problem_Traingle {
    private static void printTringleAssteric(int n) {

        for(int i=1;i<n;i++){

            for(int sp=n-i;sp>0;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println(" ");
        }

    }
    private static void printTringleNumber(int n) {

        for(int i=1;i<n;i++){

            for(int sp=n-i;sp>0;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);

            }
            System.out.println(" ");
        }

    }
    private static void printTringleNumberdec(int n) {

        for(int i=n-1;i>=1;i--){

            for(int sp=n-1;sp>i;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);

            }
            System.out.println(" ");
        }

    }

    private static void printTringleAceNumber(int n) {

        for(int i=n-1;i>=1;i--){

            for(int sp=n-i;sp>0;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);

            }
            System.out.println(" ");
        }

    }

    private static void printTringleDescNumber(int n) {

        for(int i=n-1;i>=1;i--){

            for(int sp=n-i;sp>0;sp--){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print(i);

            }
            System.out.println(" ");
        }

    }
    private static void printTringleDescNumberOder(int n) {

        for(int i=5;i>=1;i--){

            for(int sp=i;sp>=1;sp--){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print(""+j);
            }
            System.out.println("");
        }

    }
    public static void main(String[] args) {

      printTringleAssteric(5);
        System.out.println("\n");
      printTringleNumber(5);
        System.out.println("\n");
      printTringleNumberdec(5);
        System.out.println("\n");
        printTringleAceNumber(5);
        System.out.println("\n");
        printTringleDescNumberOder(5);
        System.out.println("\n");
    }


}
