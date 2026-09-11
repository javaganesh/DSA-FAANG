package com.dsa.backTracking1;

public class GenerateAllSubseQuceCount {
    private static int count(String str, int idx, String ans) {

        if(idx==str.length()){
           return 1;

        }
       int take = count(str,idx+1,ans+str.charAt(idx));
        int skip= count(str,idx+1,ans);
        return take+skip;

    }
    public static void main(String[] args) {
    String str="ABC";
        System.out.println( count(str,0,""));
    }


}
