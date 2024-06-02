package com.dsa.string;

public class CanMakeAllSame {
    public static void main(String[] args) {
        System.out.println(canMakeAllSame("101") ? "Yes" : "No");
    }

    private static boolean canMakeAllSame(String s) {
        int zero=0; int one=0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch == '0')
                ++zero;
            else
                ++one;
        }
        return   (zero==1 || one==1);

    }
}
