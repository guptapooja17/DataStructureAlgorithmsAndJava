package com.java;

public class LamdaExample {
    public static void main(String[] args) {
        // way 1 implemention of hello
        Hello lm = (s) -> "Hello" + s;
        System.out.println(lm.hello("Pooja"));

        // way 2 implemention of hello
        Hello helloReference = String::toUpperCase;
        System.out.println(helloReference.hello("Pooja"));
    }
}

@FunctionalInterface
interface Hello {
    String hello(String s);
}