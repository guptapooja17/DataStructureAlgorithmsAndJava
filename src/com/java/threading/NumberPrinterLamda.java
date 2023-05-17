package com.java.threading;

public class NumberPrinterLamda {
        public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                int num = i;
                Thread t = new Thread(() -> {
                    System.out.println("Printing Number :  " + num + "  Thread Name :  " + Thread.currentThread().getName());
                });
                try {
                    if (num == 40 || num == 60) {
                        Thread.sleep(2000);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Thread stopped " + e);
                }
                t.start();
            }
        }
    }

