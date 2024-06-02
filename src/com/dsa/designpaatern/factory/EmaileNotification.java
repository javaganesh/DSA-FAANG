package com.dsa.designpaatern.factory;

public class EmaileNotification implements  Notifcation {
    @Override
    public void notifyed() {
        System.out.println("EMAIL NOTIFCATION");
    }
}
