package com.dsa.backTracking1;

public class GenerateAllSubseQuce_Abc {
    private static void generateSubSequnce(String str, int idx, String ans) {

        if(idx==str.length()){
            System.out.println(ans);
            return;
        }
        generateSubSequnce(str,idx+1,ans+str.charAt(idx));
        generateSubSequnce(str,idx+1,ans);

    }
    public static void main(String[] args) {
    String str="ABC";
    generateSubSequnce(str,0,"");
    }


}
