package com.example.factorymethod;

public class PushNotificationFactory extends NotificationFactory {
    @Override
    protected Notification createNotification(String recipient) {
        return new PushNotification(recipient);
    }
}
