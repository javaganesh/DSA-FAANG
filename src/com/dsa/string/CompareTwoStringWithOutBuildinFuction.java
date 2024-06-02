package com.dsa.string;

public class CompareTwoStringWithOutBuildinFuction {
    public static void main(String[] args) {
        String str1="Ganesh";
        String str2="Ganesh";

        System.out.println( isCompare(str1, str2));
    }

    private static boolean isCompare(String str1, String str2) {
        Boolean isCompare=false;
        if(str1.length()!= str2.length()){
            return isCompare=false;
        } else {
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i) !=str2.charAt(i)){
                    isCompare=false;
                    break;
                }
                isCompare=true;
            }
            return isCompare;
        }

    }
}
