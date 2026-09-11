package com.dsa.designpaatern.proxy;

public class RealDocument implements Dcoument{
    @Override
    public void display() {
        System.out.println("I am adimin person i can acess it");
    }
}
