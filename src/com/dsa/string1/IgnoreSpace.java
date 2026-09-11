package com.dsa.string1;

public class IgnoreSpace {
    private static boolean pallendromeIgnoreComma(String str) {
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)==','){
                while (left<right && !Character.isLetterOrDigit(left)){
                    left++;
                }
            }
            if(str.charAt(right)==','){
                while (left<right && !Character.isLetterOrDigit(right)){
                    right--;
                }
            }
            if(str.charAt(left)!=str.charAt(right)){
                System.out.println(str.charAt(left)+" "+str.charAt(right));
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="ab,,,,,c,ba";
        System.out.println(pallendromeIgnoreComma(str));
    }



}
