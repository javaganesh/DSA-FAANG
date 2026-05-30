package com.dsa.designpaatern.VDP.Observer;

public class User1 implements  Subscriber{
    @Override
    public void update(String videoTitle) {
        System.out.println("user 1 new vedios got uploaded:"+videoTitle);
    }
}
