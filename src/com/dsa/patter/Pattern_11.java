package com.dsa.patter;

public class Pattern_11 {
    public static void print_Rev_V(int n){
        int px=n;
         int py=n;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=2*n;j++){
                if(j==px || j==py){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            px--;
            py++;
            System.out.println();

        }
    }

    public static void print_V(int n){
        int px=1;
        int py=n*2-1;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=2*n;j++){
                if(j==px || j==py){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            px++;
            py--;
            System.out.println();

        }
    }

    public static void main(String[] args) {
        print_Rev_V(5);
        System.out.println("\n");
        print_V(5);
    }

}
