package com.dsa.string;

public class PermutationOfString {

    public static void permituation(String str){
         int n=str.length();
         int f=factorialNumber(n);

         for(int i=0;i<f;i++){
             StringBuilder sb=new StringBuilder(str);
             int temp=i;
             for(int div=n;div>=1;div--){
                 int q =temp/div;
                 int r=temp%div;

                 System.out.print(sb.charAt(r));
                 sb.deleteCharAt(r);
                 temp=q;
             }
             System.out.println();
         }

    }

    private static int factorialNumber(int n) {
        if(n==1 || n==0){
            return  n;
        }
        return n*factorialNumber(n-1);
    }

    public static void main(String[] args) {
        permituation("abc");
    }

}
