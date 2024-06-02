package com.dsa.string;

import java.util.Arrays;

public class TwoStringAreAnangramOrNot {
    public static void main(String[] args) {
        String str1="abc";
        String str2="bcad";
        System.out.println(isAnnagramOrNot(str1, str2));


    }

    private static boolean isAnnagramOrNot(String str1, String str2) {

        if(str1.length()== str2.length()){
            char[] chArray1= str1.toCharArray();
            char[] chArray2= str2.toCharArray();
            Arrays.sort(chArray1);
            Arrays.sort(chArray2);
            Arrays.compare(chArray1,chArray2);
            return true;
        }
        return false;
    }
}
