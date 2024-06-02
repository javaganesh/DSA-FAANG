package com.dsa.designpaatern.factory;

public class NotifcationFactory {
    public static Notifcation createNotification(String type){
        if(type.equalsIgnoreCase("email")){
            Notifcation notifcation=new EmaileNotification();
            return notifcation;
        }
        else if(type.equalsIgnoreCase("sms")){
            Notifcation notifcation=new SmsNotificate();
            return notifcation;
        }
        return null;
    }

}
