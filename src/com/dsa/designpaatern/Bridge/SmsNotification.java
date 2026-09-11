package com.dsa.designpaatern.Bridge;

public class SmsNotification
        extends Notification {

    public SmsNotification(
            NotificationSender sender) {

        super(sender);

    }

    @Override
    public void notifyUser(String message) {

        System.out.println(
                "Preparing SMS...");

        sender.send(message);

    }

}
