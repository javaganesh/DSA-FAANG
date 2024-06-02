package com.dsa.patter;

import java.util.Scanner;

class pattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        pattern1(n);

    }

    private static void pattern1(int n) {
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
               if(i==1 || j==1 || i==n || j==n){
                   System.out.print(" * ");
               }
               else {
                   System.out.println(" ");
               }

            }
        }
        System.out.println(" ");
    }

}
