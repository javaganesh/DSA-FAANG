package com.dsa.designpaatern.command;

public class TurnOnTvCommand implements  Command{
    private TV tv;

    public TurnOnTvCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOnTv();
    }
}
