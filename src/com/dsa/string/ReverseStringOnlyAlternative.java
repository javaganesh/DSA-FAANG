package com.dsa.string;

public class ReverseStringOnlyAlternative {
    public static void main(String[] args) {

        String str = "Programming";

        int i = str.length() - 1;
        while (i>=0){
            System.out.print(str.charAt(i));
            i=i-2;
        }
    }

}
