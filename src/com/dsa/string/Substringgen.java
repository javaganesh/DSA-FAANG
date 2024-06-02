package com.dsa.string;

public class Substringgen {
    public static void main(String[] args) {
        String str="LeetCode";
        generateSubString(str);
    }

    private static void generateSubString(String str) {
        int n=str.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
