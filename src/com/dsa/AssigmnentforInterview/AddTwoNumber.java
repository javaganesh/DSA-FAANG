package com.dsa.AssigmnentforInterview;

import java.text.DecimalFormat;

public class AddTwoNumber {
   public static String fibonacci(int n){
       if(n== 0 || n==1){
           return String.valueOf(0);

       }
      int  result=0;
       int fib1=0;
       int fib2=1;
       for(int i=1;i<=n;i++){
           result=fib1+fib2;
           fib1=fib2;
           fib2=result;
       }


   return  String.valueOf(result);

   }
   public static String converForCommaFormat(String s){
       DecimalFormat d= new DecimalFormat("#,###.##");
        return d.format(d);

   }


    public static String add(String num1, String num2){

       // separte the comma
        num1=num1.replaceAll(",","");
        num1=num2.replaceAll(",","");


        //Find the maximum of length of two number for add zero for padding
       int maxLength=Math.max(num1.length(),num2.length());

       //create StringBuilder object for add padding zero
       StringBuilder sb1=new StringBuilder(num1);
       StringBuilder sb2=new StringBuilder(num2);
       while(sb1.length() <maxLength){
           sb1.insert(0,'0');
       }

       while(sb2.length()<maxLength){
           sb2.insert(0,'0');
       }
       StringBuilder addtionResult=new StringBuilder();
       int carry=0;
       for(int i=maxLength-1;i>=0;i--){
           int dig1=sb1.charAt(i)-'0';
           int dig2=sb2.charAt(i)-'0';
           int sumOfDigit=dig1+dig2+carry;
           addtionResult.insert(0,sumOfDigit%10);
           carry=sumOfDigit/10;

       }
       if(carry>0){
           addtionResult.insert(0,carry);
       }
        for(int i=addtionResult.length()-3;i>0;i=-3){
            addtionResult.insert(i,",");
        }
       return  addtionResult.toString();

   }

    public static void main(String[] args) {

      /*  System.out.println(add("1,100","999"));
        System.out.println(add("77","77"));
        System.out.println(add("1","99999999999999999999999999999"));
        System.out.println(add("99999999999999999999999999999","1"));
        System.out.println(add("99999999999999999999999999999","99999999999999999999999999999"));
*/

        System.out.println(fibonacci(5));




    }
}
