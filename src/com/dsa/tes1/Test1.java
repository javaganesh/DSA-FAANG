package com.dsa.tes1;

import java.math.BigInteger;

public class Test1 {
    private static int[] findtheSumofTwoLarzeNumber( String str1, String str2) {
        // edge case check for string shoud not be blank and empty
         if(str1.isBlank() || str1.isEmpty()){
             return   new int[] {Integer.parseInt(str2)};

         }
        if(str2.isBlank() || str2.isEmpty()){
            return new int[]{Integer.parseInt(str1)};

        }
        //91+1=92


         // conver to string to charArray
        char[] cstr1=str1.toCharArray();// "99"==   1
        char[] cstr2=str2.toCharArray();//  "1" == 91
        int i=cstr1.length-1,j=cstr2.length-1;
        int[] result=new int[cstr1.length+cstr2.length]; //3  reslut[0]==10


        int k=result.length-1;;


       while(i>0 || j>0){
           if(Character.isDigit(cstr1[i]) && Character.isDigit(cstr1[j])){
               int a = Integer.parseInt(String.valueOf(cstr1[i]));
               int b = Integer.parseInt(String.valueOf(cstr2[j]));
               result[k--]=a+b;

           }
           if(i==0){
               result[k--]=cstr2[j];
           }
           if(j==0){
               result[k--]=cstr1[j];
           }
           i++;
           j++;
       }






        return result;
    }
    public static void main(String[] args) {

        String str1="91";
        String str2="1";
        //9 1


        int[] result =findtheSumofTwoLarzeNumber(str1,str2);


    }


}
