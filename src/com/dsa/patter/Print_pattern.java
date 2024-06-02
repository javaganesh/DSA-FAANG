package com.dsa.patter;

public class Print_pattern {
    public static  void printMountainepatternEstric(int n){
        int z=1;
        for(int i=1;i<n;i++){
            for(int sp=n-1;sp>=i;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=z;j++){
                System.out.print("*");
            }
            System.out.println();
            z+=2;

        }
    }

    public static  void printMountainepatternNumber(int n){
        int z=1;
        for(int i=1;i<n;i++){
            for(int sp=n-1;sp>=i;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=z;j++){
                System.out.print(i);
            }
            System.out.println();
            z+=2;

        }
    }
    public static  void printMountainepattern123(int n){
        int z=1;
        for(int i=1;i<n;i++){
            for(int sp=n-1;sp>=i;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=z;j++){
                System.out.print(j);
            }
            System.out.println();
            z+=2;

        }
    }

    public static  void printMountainepattern123_2(int n){
        int z=1;
        for(int i=1;i<n;i++){
            for(int sp=n-1;sp>=i;sp--){
                System.out.print(" ");
            }
            for(int j=z;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            z+=2;

        }
    }
    public static  void printMountainepattern123_3(int n){
        int z=1;
        for(int i=1;i<n;i++){
            for(int sp=n-1;sp>=i;sp--){
                System.out.print(" ");
            }
            for(int j=z;j>=1;j--){
                System.out.print(Math.abs(j-i));
            }
            System.out.println();
            z+=2;

        }
    }
    public static  void printMountainepattern123_4(int n){
        int z=1;
        for(int i=1;i<n;i++){
            for(int sp=n-1;sp>=i;sp--){
                System.out.print(" ");
            }
            for(int j=i-1;j>=-(i-1);j--){
                System.out.print(i-Math.abs(j));
            }
            System.out.println();
            z+=2;

        }
    }

    public static  void printMountainepattern123_ABC(int n){
        int z=1;
        for(int i=1;i<n;i++){
            for(int sp=n-1;sp>=i;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=z;j++){
                System.out.print((char) (i+64));
            }
            System.out.println();
            z+=2;

        }
    }
    public static  void printMountainepatternAbc_2(int n){
        int z=1;
        for(int i=1;i<n;i++){
            for(int sp=n-1;sp>=i;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=z;j++){
                System.out.print((char) (j+64));
            }
            System.out.println();
            z+=2;

        }
    }


    public static void main(String[] args) {

       printMountainepatternEstric(5);
        System.out.println();
        printMountainepatternNumber(5);
        System.out.println();
        printMountainepattern123(5);
        System.out.println();
        printMountainepattern123_2(5);
        System.out.println();
        printMountainepattern123_3(5);
        System.out.println();
        printMountainepattern123_4(5);
        System.out.println();
        printMountainepattern123_ABC(5);
        System.out.println();
        printMountainepatternAbc_2(5);
    }
}
