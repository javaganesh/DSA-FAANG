package com.dsa.backTracking1;

public class TargetMatching {
    private static boolean isSubsequence(String str, String target, int i, int j) {
       if(j==target.length()){
           return true;
       }
       if(i==str.length()){
           return false;
       }
       if(str.charAt(i)==target.charAt(j)){
           boolean take=isSubsequence(str,str,i+1,j+1);
           if(take){
               return true;
           }
       }
       boolean skip=isSubsequence(str,target,i,j+1);
       return skip;

    }
    public static void main(String[] args) {
        String str = "abc";
        String target = "ac";

        boolean result =
                isSubsequence(str, target, 0, 0);

        System.out.println(result);
    }


}
