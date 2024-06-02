package com.dsa.patter;

import java.util.Scanner;

class Pattern {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();

   problem2(n);

  }
 private static void problem2(int n) {
  for(int i = 1; i<= n; i++){
   for(int j = 1; j<= n; j++){
    if((i==j) || (i+j== n +1) ){
     System.out.print(" * ");
    }
    else {
     System.out.print(" # ");
    }

   }
   System.out.println(" ");
  }
 }

 private static void problem1(int n) {
  for(int i = 1; i<= n; i++){
   for(int j = 1; j<= n; j++){
    if((i==j) || (i+j== n +1) ){
     System.out.print(" * ");
    }
    else {
     System.out.print(" ");
    }

   }
   System.out.println(" ");
  }
 }
}
