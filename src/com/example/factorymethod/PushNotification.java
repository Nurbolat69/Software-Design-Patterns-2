package com.example.factorymethod;

public class PushNotification implements Notification {
    private final String deviceId;

    public PushNotification(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void send(String message) {
        System.out.printf("[PUSH] To device: %s | Message: %s%n", deviceId, message);
    }
}

