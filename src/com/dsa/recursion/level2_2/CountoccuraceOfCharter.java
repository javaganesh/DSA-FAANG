package com.dsa.recursion.level2_2;

public class CountoccuraceOfCharter {
    public static void main(String[] args) {
        String str = "banana";
        char ch = 'a';
        System.out.println(countOccuranceOfString(str,ch,0));
    }

    private static int countOccuranceOfString(String str, char ch,int idx) {
        if(idx>=str.length()){
            return 0;
        }

        int rm=countOccuranceOfString(str,ch,idx+1);
        if(str.charAt(idx)==ch){
           return  1+rm;
        }
        return rm;
    }
}
