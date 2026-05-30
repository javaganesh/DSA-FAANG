package com.dsa.whileloop;

public class Print1_10 {
    public static void main(String[] args) {
        int i=1;
        /*while (i<11){
            System.out.println(i);
            i++;
        }*/
      /*  while (i<11 ){
            if(i%2==0)
            System.out.println(i);
            i++;
        }*/
//        System.out.println("=====odd=====");
//        while (i<11 ){
//            if(i%2!=0)
//                System.out.println(i);
//            i++;
//        }
       /*int n=2;
        while (i<=10 ){

                System.out.println(n*i);
            i++;
        }*/
          /*int n=678;
          int cnt=0;

        while (n!=0 ){
          cnt++;
          n=n/10;
        }
        System.out.println(cnt);*/


        /*int n=678;
       int sum=0;
        while (n!=0 ){
            int r=n%10;
            sum+=r;
            n=n/10;

        }
        System.out.println(sum);*/


      /*  int n=678;
        int rev=0;
        int r;
        while (n!=0 ){
             r=n%10;
            rev=(rev*10)+r;
            n=n/10;

        }
        System.out.println(rev);
*/


        int n=121;
        int or=121;
        int rev=0;
        int r;
        while (n!=0 ){
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;

        }
        System.out.println(rev==or);








    }
}
