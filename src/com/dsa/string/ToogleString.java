package com.dsa.string;

public class ToogleString {
    public static void main(String[] args) {
        String str="GaNesH PaRiDa";
        System.out.println(str);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
           Boolean flag=true;
            char c =str.charAt(i);
            if(c==' '){
                continue;
            }
           int assic=(int)c;

           if(assic>=97){
               flag=false;
           }
           if(flag==true){
               int cap = assic + 32;
               sb.append((char)cap);
           }
           else {
               int sm = assic -32;
               sb.append((char)sm);
           }


        }
        System.out.println(sb.toString());
    }
}
