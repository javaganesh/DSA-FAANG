package com.dsa.patter;

public class Patter_5_ReactAngle {
    public static void charterPattern(int n){
        for(int i=65;i<n;i++){
            for(int j=65;j<n;j++){
                System.out.print((char) i+" ");
            }
            System.out.println(" ");
        }
    }
    public static void charterPattern2(int n){
        for(int i=65;i<n;i++){
            for(int j=65;j<n;j++){
                System.out.print((char) j+" ");
            }
            System.out.println(" ");
        }
    }

    public static void charterPattern3(int n){
        for(int i=1;i<5;i++){

            for(char c='E';c>='A';c--){
                System.out.print(c+" ");
            }
            System.out.println(" ");

        }
    }
    public static void charterPattern4(int n){
        for(char i='E';i>='A';i--){

            for(char j='E';j>='A';j--){
                System.out.print(i+" ");
            }
            System.out.println(" ");

        }
    }
    public static void main(String[] args) {
        charterPattern(70);
        System.out.println("====================");
        charterPattern2(70);
        System.out.println("====================");
        charterPattern3(70);
        System.out.println("====================");
        charterPattern4(70);

    }
}
