package com.example.abstractfactory;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("DarkButton: render with dark theme styles");
    }
}
