package com.java.threading;

// When two threads writing and reading the variable at the same time. Synchronize the counter will allow only one thread to at a time i.e. one atomic operation.
public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
        final Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
            System.out.println("Thread t1 : counter :  " + counter.getCount());
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
            System.out.println("Thread t2 : counter :  " + counter.getCount());

        });

        t1.start();
        t2.start();
        System.out.println("Counter value: " + counter.getCount());
    }
}
class Counter {
    private int count;
    public void increment() {
        synchronized (this) {
            this.count++;
        }
    }
    public int getCount() {
        return count;
    }
}
