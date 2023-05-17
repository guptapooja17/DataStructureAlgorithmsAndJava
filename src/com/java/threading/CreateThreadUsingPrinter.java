package com.java.threading;

public class CreateThreadUsingPrinter {
    public static void main(String[] args) {
        System.out.println("I'm main thread : Thread Name :  " + Thread.currentThread().getName());
        Thread t = new Thread( HelloWorldPrinter:: print);
        t.setName("HelloWorldPrinter");
        t.start();
    }
}

class HelloWorldPrinter {
    static void print() {
        System.out.println("Hello World  : Thread Name  : " + Thread.currentThread().getName());
    }
}