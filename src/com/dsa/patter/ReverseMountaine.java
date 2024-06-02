package com.dsa.patter;

public class ReverseMountaine {
    public static  void reverse(int n){
        int z=n*2-1;
        for(int i=n;i>=1;i--){

            for(int sp=n-1;sp>=i;sp--){
                System.out.print(" ");
            }
            for(int k=1;k<=z;k++){
                System.out.print("*");
            }
            System.out.println(" ");
            z-=2;
        }
    }

    public static  void reverse_123(int n){
        int z=n*2-1;
        for(int i=n;i>=1;i--){

            for(int sp=n-1;sp>=i;sp--){
                System.out.print(" ");
            }
            for(int k=1;k<=z;k++){
                System.out.print(i);
            }
            System.out.println(" ");
            z-=2;
        }
    }

    public static  void reverse_123_2(int n){
        int z=n*2-1;
        for(int i=n;i>=1;i--){

            for(int sp=n-1;sp>=i;sp--){
                System.out.print(" ");
            }
            for(int k=1;k<=z;k++){
                System.out.print(k);
            }
            System.out.println(" ");
            z-=2;
        }
    }
    public static void main(String[] args) {
       reverse(4);
        System.out.println();
       reverse_123(4);
       reverse_123_2(4);
    }

}
