package com.dsa.designpaatern.factory;

public class SmsNotificate implements Notifcation {


    @Override
    public void notifyed() {
        System.out.println("Sms Notification");
    }
}
