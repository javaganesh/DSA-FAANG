package com.dsa.backTracking1;

public class GenerateAllSubSequncy {
    private static void generate(String str, int idx, String ans) {
        if(idx==str.length()){
            System.out.println(ans);
            return;
        }

        generate(str,idx+1,ans+str.charAt(idx));
        generate(str,idx+1,ans);

    }
    public static void main(String[] args) {
        String str = "ab";

        generate(str, 0, "");
    }


}
