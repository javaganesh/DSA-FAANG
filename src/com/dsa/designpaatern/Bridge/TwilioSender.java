package com.dsa.designpaatern.Bridge;

public class TwilioSender implements NotificationSender{
    @Override
    public void send(String message) {
        System.out.println(
                "Twilio : " + message);

    }
}
