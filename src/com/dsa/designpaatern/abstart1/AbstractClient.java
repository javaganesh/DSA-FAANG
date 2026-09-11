package com.dsa.designpaatern.abstart1;

public class AbstractClient {
    public static void main(String[] args) {
        GUIFactory guiFactory=new WindowsFactory();
        Application app = new Application(guiFactory);
        app.render();


    }
}
