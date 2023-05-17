package com.java.threading;

public class RaceConditionDemo2 {
    public static void main(String[] args) {
        Counter counter =  new Counter();

        Thread t1 = new Thread(getIncreamentalRunnable(counter));
        Thread t2 = new Thread(getReadingRunnable(counter));

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception e) {
            System.out.println(e);
        }

    }

    private static Runnable getIncreamentalRunnable ( Counter counter) {
        return () -> {
            for (int i = 0; i < 100000; i++) {
                counter.increment();
            }
            System.out.println("Thread t1 : counter :  " + counter.getCount());
        };
    }

    private static Runnable getReadingRunnable ( Counter counter) {
        return () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1);

                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("Thread t2 : counter :  " + counter.getCount());
            }
        };
    }
}
