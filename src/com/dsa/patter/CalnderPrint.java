package com.dsa.patter;

public class CalnderPrint {
    public static void printCal(int n){

        int x=1;
        for (int i=1;i<=n;i++){

            for(int j=x;j<=n*i;j++){
                System.out.print(j+" ");
                x++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        printCal(5);
    }
}
