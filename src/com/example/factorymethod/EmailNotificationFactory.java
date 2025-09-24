package com.example.factorymethod;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    protected Notification createNotification(String recipient) {
        return new EmailNotification(recipient);
    }
}

