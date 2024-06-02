package com.dsa.designpaatern.ChainOfResponsiblity;

public class ErorLogProcessor extends LogProcessor{
    ErorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel== ERROR){
            System.out.println("ERROR:"+message);
        }
        super.log(logLevel, message);
    }
}
