package com.dsa.designpaatern.Bridge;

public abstract class Notification {

    protected NotificationSender sender;

    public Notification(NotificationSender sender) {

        this.sender = sender;

    }

    public abstract void notifyUser(
            String message);

}