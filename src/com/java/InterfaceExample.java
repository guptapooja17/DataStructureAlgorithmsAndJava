package com.java;

public class InterfaceExample implements Poet, Writer{
    @Override
    public void write() {
        System.out.println("InterfaceExample default");
    }

    public static void main(String[] args) {
        Writer w = new InterfaceExample();
        w.write();
    }
}

interface Poet {
    default void write() {
        System.out.println("Poet default");
    }
}

interface Writer {
    default void write() {
        System.out.println("Writer default");
    }
}
