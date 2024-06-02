package com.dsa.recursion;

public class DecimaltoBinaryNumber {
    public static String  decimaltoBinaryNumber(int inputNumber,String result){
        if(inputNumber==0){
            return result;
        }
        result=inputNumber%2+result;
        return  decimaltoBinaryNumber(inputNumber/2,result);

    }
    public static void main(String[] args) {
        System.out.println(decimaltoBinaryNumber(233,""));
    }
}
