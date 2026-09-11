package com.dsa.designpaatern.command;

public class CommandClient {
    public static void main(String[] args) {
        Light light=new Light();
        TV tv=new TV();
        RemoteControl control=new RemoteControl();
        //control.setCommand(new LightOnCommand(light));
        control.setCommand(new TurnOnTvCommand(tv));
        control.pressButton();


    }
}
