package com.dsa.designpaatern.command;

public class LighOffCommand implements Command{
    private Light light;

    public LighOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.oFF();
    }
}
