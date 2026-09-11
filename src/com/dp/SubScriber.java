package com.dp;

public class SubScriber implements ObServer{
    private  String name;

    public SubScriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Recevided Notifcation:"+name);
    }
}
