package com.example.abstractfactory;

public class DarkCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("DarkCheckbox: render with dark theme styles");
    }
}

