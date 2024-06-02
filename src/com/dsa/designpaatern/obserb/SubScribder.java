package com.dsa.designpaatern.obserb;

public class SubScribder {
    private String name;
    private Chanelpublisher chanelpublisher=new Chanelpublisher();

    public SubScribder(String name) {
        this.name = name;
    }
    public void update(Chanelpublisher chanelpublisher){
        System.out.println("Hey "+name+"Vedio uploaded tby"+chanelpublisher.title);
    }

    public void subscribeChannel(Chanelpublisher ch){
        chanelpublisher=ch;
        System.out.println("subscribed channel is :"+chanelpublisher.title);
    }
}
