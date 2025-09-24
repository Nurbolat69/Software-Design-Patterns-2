package com.example.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        GUIFactory lightFactory = new LightGUIFactory();
        Button b1 = lightFactory.createButton();
        Checkbox c1 = lightFactory.createCheckbox();
        b1.render();
        c1.render();

        GUIFactory darkFactory = new DarkGUIFactory();
        Button b2 = darkFactory.createButton();
        Checkbox c2 = darkFactory.createCheckbox();
        b2.render();
        c2.render();
    }
}
