package com.dsa.string;

public class CheckPanagram {
    private static boolean isPanagram(String str) {
        if(str.length()<26){
            return false;
        }
        else {
            for(char ch='a';ch<='z';ch++){
                if(str.indexOf(ch)<0){
                    return false;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="The quick brown for jumps over the lazy dog";
        System.out.println(isPanagram(str.toLowerCase()));
    }


}
