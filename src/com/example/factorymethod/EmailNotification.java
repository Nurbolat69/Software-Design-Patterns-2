package com.example.factorymethod;

public class EmailNotification implements Notification {
    private final String emailAddress;

    public EmailNotification(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void send(String message) {
        System.out.printf("[EMAIL] To: %s | Message: %s%n", emailAddress, message);
    }
}

