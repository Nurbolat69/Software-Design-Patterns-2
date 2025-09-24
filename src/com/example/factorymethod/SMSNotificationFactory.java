package com.example.factorymethod;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    protected Notification createNotification(String recipient) {
        return new SMSNotification(recipient);
    }
}

