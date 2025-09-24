package com.example.factorymethod;

public abstract class NotificationFactory {
    protected abstract Notification createNotification(String recipient);

    public final void sendNotification(String recipient, String message) {
        Notification notification = createNotification(recipient);
        notification.send(message);
    }
}

