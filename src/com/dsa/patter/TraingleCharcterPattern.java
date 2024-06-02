package com.dsa.patter;

import com.dsa.array.StramOfStream;

public class TraingleCharcterPattern {
    public static void traingleCharterPatter(int n){
        for(char i='A';i<n;i++){
            for(char j='A';j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        System.out.println("==============================================");

        for(char i='A';i<=n;i++){
            for(char j='A';j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }

        System.out.println("===========================================================================");
        for(char i='E'; i>='A';i--){
            for(char j='E';j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        System.out.println("===========================================================================");
        for(char i='E'; i>='A';i--){
            for(char j='E';j>=i;j--){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }

        System.out.println("=======================================");

        for(char i='A';i<='E';i++){

            for(char j='E';j>=i;j--){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }

        System.out.println("=======================================");

        for(char i='A';i<='E';i++){

            for(char j='E';j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

       // System.out.println("=============================================");
        System.out.println("=======================================");
        for(char i='E'; i>='A';i--){
            for(char j='A';j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
        for(char i='A'; i<='E';i++){
            for(char j='E';j<='A';j--){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        traingleCharterPatter(70);
        System.out.println("===========================");
    }
}
