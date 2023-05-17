package com.java.threading;

public class NumberPrinter {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Thread t = new Thread(NumberTaker::printNumber(i)); Cannot do this bcz we are passing argument to printNumber, method reference won't work
            Thread t = new Thread(new NumberTaker(i));
            try {
                if ( i == 40 || i == 60 ) {
                    Thread.sleep(5000);
                }
            } catch (Exception e) {
                System.out.println("thread stopped " + e);
            }
            t.start();
        }
    }
}

class NumberTaker implements Runnable{
    protected Integer num;
    public NumberTaker() {}
    public NumberTaker(Integer num) {
        this.num = num;
    }
    @Override
    public void run() {
        System.out.println("Printing Number :  " + num + "  Thread Name :  " + Thread.currentThread().getName());
    }
}