package com.dsa.dp;

public class loopSwitch {
    public static void swich(int n){
     for(int i=1;i<n;i++){
         switch (i){
             case 1:
                 System.out.println("one");
                 break;
             case 2:
                 System.out.println("two");
                 break;
             case 3:
                 System.out.println("3");
                 break;

             case 5:
                 System.out.println("5");
                 break;
             case 6:
                 System.out.println("6");
                 break;
             case 7:
                 System.out.println("7");
                 break;
             case 8:
                 System.out.println("8");
                 break;
             case 9:
                 System.out.println("9");
                 break;
             case 10:
                 System.out.println("11");
                 break;

         }
         System.out.println("==========**======================");
         if(i==5)break;
     }

    }
    public static void main(String[] args) {
        int n=10;
       swich(10);
    }
}
