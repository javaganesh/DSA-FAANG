package com.dsa.designpaatern.ChainOfResponsiblity;

public class Client {
    public static void main(String[] args) {
        LogProcessor logProcessor=new InfoLogProcessor(new DebugLogProcessor(new ErorLogProcessor(null)));
        logProcessor.log(3,"erro");
    }
}
