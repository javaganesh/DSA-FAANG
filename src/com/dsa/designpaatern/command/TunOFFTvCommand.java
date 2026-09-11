package com.dsa.designpaatern.command;

public class TunOFFTvCommand implements Command{
    private TV tv;

    public TunOFFTvCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOFFTv();
    }
}
