package com.dsa.string;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample4 {
     public static void getCharExample(String str){
         char[] ch  = new char[23];
         try{
             str.getChars(0, 22, ch, 0);
             System.out.println(ch);
         }catch (Exception e) {
             System.out.println(e);
         }


     }


    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "Welcome to JavaTpoint.";
        System.out.println(str.length());
        getCharExample(str);
        /*System.out.println("The input String is : ");
        System.out.println(str + "\n");


        byte[] byteArr = str.getBytes();
        System.out.println("After converted into UTF-17 the String is : ");

        for (int j = 0; j < byteArr.length; j++)
        {
            System.out.print(byteArr[j]);
        }*/
    }
}
