package com.dsa.numberSystem;

public class Factor {
    private static void findTheFactor_Eff(int n) {
        for(int i=1;i*i<=n;i++){
            if(n%i==0) {
                System.out.print(i + " ");
                if(i!=n/i){
                    System.out.print(n / i + " ");
                }
            }
        }
    }
    private static void findTheFactor(int n) {
        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
       // findTheFactor(18);
        findTheFactor_Eff(36);
    }


}
