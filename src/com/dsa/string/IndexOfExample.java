package com.dsa.string;

public class IndexOfExample {
    public static void main(String[] args) {

        String s1="this is index of example";
        int index1=s1.indexOf("is");//returns the index of is substring
        int index2=s1.indexOf("index");//returns the index of index substring
        System.out.println(index1+"  "+index2);


        int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index
        System.out.println(index3);

        int index4=s1.indexOf('s');//returns the index of s char value
        System.out.println(index4);//3


        String str = "Welcome to JavaTpoint";
        int count = 0;
        int startFrom = 0;

        for(;;){
            int index = str.indexOf('o', startFrom);


            
        }

    }
}
