package com.dsa.string;

public class RemoveCharter {
    public static void main(String[] args) {
        String word = "geeksforgeeks";
        char ch = 'e';
       // removechar(word, ch);
        removecharWithStringBuider(word, ch);
    }

    private static void removecharWithStringBuider(String word, char ch) {
    StringBuilder sb=new StringBuilder(word);
    for(int i=0;i<sb.length();i++){
        if(sb.charAt(i)==ch){
            sb.deleteCharAt(i);
        }
    }
        System.out.println(sb.toString());

    }

    private static void removechar(String word, char ch) {
        char[] charArray=word.toCharArray();
        int k=0;
        int occ=0;
        for(char c: charArray){
            if(c!=ch){
                charArray[k++]=c;
            }
            else{
               occ++;
            }
        }
        while(occ>0){
            charArray[k++]= ' ';
            occ--;
        }

        System.out.println(new String(charArray));
    }
}
