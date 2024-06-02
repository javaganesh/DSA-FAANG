package com.dsa.wipro;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestForWipro {
    private static void reverseWord(String[] strArray) {

        //System.out.println("original string :"+Arrays.toString(strArray));


        /*int n=strArray.length;
        int i=0,j=n;
        *//*while(i<j){
            String temp=strArray[i];
            strArray[j]=strArray[i];
            strArray[i]=temp;
            i++;
            j--;
        }*/
      StringBuilder sb=new StringBuilder();

        for(int i= strArray.length-1;i>=0;i--){
           sb.append(strArray[i]).append(" ");
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

        String str="All is Well";

        String[] strArray=str.split(" ");

        reverseWord(strArray);


    }


}
