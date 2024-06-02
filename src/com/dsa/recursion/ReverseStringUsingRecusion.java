package com.dsa.recursion;

public class ReverseStringUsingRecusion {
    public static  void checkStringPallendromeOrNot(String str){
        String reverseString = reveseString(str);
        if(reverseString.equals(str)){

        }
        else{

            System.out.println("String is not pallendrome");
        }

    }
    private static String reveseString(String str) {
        if(str.length()==0){
            return " ";
        }
        return reveseString(str.substring(1))+str.charAt(0);

    }
    public static void main(String[] args) {
        String str="Ganesh Chandra Parida";
        String revString=reveseString(str);
        System.out.println(revString);
        checkStringPallendromeOrNot("radee");
    }


}
