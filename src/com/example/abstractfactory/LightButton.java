package com.example.abstractfactory;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("LightButton: render with light theme styles");
    }
}
