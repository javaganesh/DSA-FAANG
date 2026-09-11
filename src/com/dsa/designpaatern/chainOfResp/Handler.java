package com.dsa.designpaatern.chainOfResp;

public abstract class Handler {
    private Handler nextHandler;

    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;

        return nextHandler;

    }
    public void handle(LoginRequest request) {
        process(request);
        if(nextHandler!=null){
            nextHandler.handle(request);
        }
    }
    protected abstract void process(LoginRequest request);
}
