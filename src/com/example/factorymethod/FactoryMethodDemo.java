package com.example.factorymethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        NotificationFactory emailFactory = new EmailNotificationFactory();
        emailFactory.sendNotification("alice@example.com", "Hello Alice via Email!");

        NotificationFactory smsFactory = new SMSNotificationFactory();
        smsFactory.sendNotification("+1234567890", "Hello via SMS!");

        NotificationFactory pushFactory = new PushNotificationFactory();
        pushFactory.sendNotification("device-uuid-1234", "You have a new alert!");
    }
}
