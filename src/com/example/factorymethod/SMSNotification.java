package com.example.factorymethod;

public class SMSNotification implements Notification {
    private final String phoneNumber;

    public SMSNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(String message) {
        System.out.printf("[SMS] To: %s | Message: %s%n", phoneNumber, message);
    }
}

