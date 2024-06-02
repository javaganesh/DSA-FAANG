package com.dsa.tes1;

public class SingleTonInstnce {
    private  static SingleTonInstnce instnce ;// eagger inlizatiom

    private SingleTonInstnce(){

    }
    public static synchronized SingleTonInstnce getInstance(){
        if(instnce!=null ){
            return instnce;
        }
        if(instnce==null){
            return new SingleTonInstnce();
        }
        return instnce;
    }

    public static void main(String[] args) {

    }
}
