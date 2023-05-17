package com.java.design.patterns;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        WindowsFactory windowsFactory = new WindowsFactory();
        Button button = windowsFactory.createButton();
        Menu menu = windowsFactory.creatMenu();
        button.paintButton();
        menu.paintMenu();
    }
}

interface Button {
    void paintButton();
}
interface Menu {
    void paintMenu();
}
class Windows implements Button, Menu {
    @Override
    public void paintButton() {
        System.out.println("Making windows button");
    }
    public void paintMenu() {
        System.out.println("Making windows menu");
    }
}
class Mac implements Button, Menu {
    @Override
    public void paintButton() {
        System.out.println("Making Mac button");
    }
    public void paintMenu() {
        System.out.println("Making Mac menu");
    }
}

interface GUIFactory {
    Button createButton();
    Menu creatMenu();
}

class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
         return new Windows();
    }

    @Override
    public Menu creatMenu() {
        return new Windows();
    }
}

class MacFactory implements GUIFactory {
    public Button createButton() {
        return new Mac();
    }

    @Override
    public Menu creatMenu() {
        return new Mac();

    }
}