package com.java;

public class VolatileExample {
    private volatile boolean running = true;

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void start() {
        int i = 0;
        while (running) {
            System.out.println("t1 called " + running);
        }
    }

    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();
        Thread t1 = new Thread(example::start);
        Thread t2 = new Thread(() -> {
            example.setRunning(false);
            System.out.println("t2 called "+ example.running);
        });
        t1.start();
        t2.start();
    }
}
