package com.dsa.designpaatern.Bridge;

public class AwsSender
        implements NotificationSender {

    @Override
    public void send(String message) {

        System.out.println(
                "AWS SNS : " + message);

    }

}