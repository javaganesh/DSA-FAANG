package com.dsa.designpaatern.Bridge;

public class EmailNotification
        extends Notification {
    public EmailNotification(
            NotificationSender sender) {
        super(sender);

    }

    @Override
    public void notifyUser(String message) {
        System.out.println(
                "Preparing Email...");
        sender.send(message);

    }

}