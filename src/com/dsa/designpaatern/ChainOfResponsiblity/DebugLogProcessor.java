package com.dsa.designpaatern.ChainOfResponsiblity;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel==DEBUG){
            System.out.println("DEBUG:"+message);
        }
        super.log(logLevel, message);
    }
}
