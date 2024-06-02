package com.dsa.designpaatern.factory;

public class NotificationClient {
    public static void main(String[] args) {
        Notifcation notifcation= NotifcationFactory.createNotification("sms");
        notifcation.notifyed();
        Notifcation notifcation2= NotifcationFactory.createNotification("email");
        notifcation2.notifyed();

    }
}
