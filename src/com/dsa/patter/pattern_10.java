package com.dsa.patter;

/*



*
* */
public class pattern_10 {
    public static void printPattern_es(int n){
        for(int i=n;i>=-n;i--){

            for(int sp=1;sp<=Math.abs(i);sp++){
                System.out.print(" ");
            }
            for(int p=n;p>=Math.abs(i);p--){
                System.out.print("* ");
            }
            System.out.println("\n");
        }

    }
    public static void main(String[] args) {
        printPattern_es(3);
    }
}
