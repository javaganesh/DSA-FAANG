package com.dsa.recursion;

public class LeadingTrailAndendSapce {
    public static void main(String[] args) {
        String input ="        This     is    interview program     ";
        char[] charArray=input.toCharArray();
        int stsp=0;
        int ensp=0;
        int midsp=0;
        for(char c:charArray){
          if(c== ' '){
              stsp++;
          }
          else{
              break;
          }
        }
        for(char c:charArray){
            if(c== ' '){
                midsp++;
            }

        }

        for(int i=charArray.length-1;i>0;i--){
            if(charArray[i]==' '){
              ensp++;
            }
            else {
                break;
            }
        }
        System.out.println(stsp);
        System.out.println(ensp);
        System.out.println(midsp);
    }
}
