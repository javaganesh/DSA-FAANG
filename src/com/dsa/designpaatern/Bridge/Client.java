package com.dsa.designpaatern.Bridge;

public class Client {
    public static void main(String[] args) {
        NotificationSender sender =
                new TwilioSender();

        Notification notification =
                new EmailNotification(sender);

        notification.notifyUser(
                "Welcome");
    }
}
