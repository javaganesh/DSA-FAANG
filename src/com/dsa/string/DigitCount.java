package com.dsa.string;

public class DigitCount {
    public static void main(String[] args) {
        int i=10;
        while(i<=100) {
            int sum=0;
            int j;
            for ( j = i; j>0; j=j/10) {
               sum+=j%10;

            }
            System.out.println(sum);
            i++;
        }
    }
}
