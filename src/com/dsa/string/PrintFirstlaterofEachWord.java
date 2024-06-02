package com.dsa.string;

public class PrintFirstlaterofEachWord {
    public static void main(String[] args) {
        String str ="Ganesh Chandra Parida";
        String res="";
        String[] strAarry=str.split(" ");
        for(int i=0;i<strAarry.length;i++){

            res+=strAarry[i].charAt(0);
            //System.out.println(strAarry[i].charAt(0));
        }
        System.out.println(res);

    }


}
