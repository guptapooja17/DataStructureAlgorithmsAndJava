package com.java.assignments;

/*
 * 1. Functionality reused
 * 2. Occurs in the single class, may occur in the child classes
 * 3. Must have different no. arguments and thier types and different order of arguments
 * 4. May have different return types, access modifiers, exceptions
 * 5. Known as compile-time or static POLYMORPHISM.
 * 6. Applied on static or non-static methods.
 * 7. No respect for generics
 */

public class MethodOverloading {
    public static void main(String[] args) {
        new MethodOverloading().demo(1,2,3,4,4,5);
        new MethodOverloading().demo("Pooja","Nikhil","Pradeep");
        // new MethodOverloading().demo();
        new MethodOverloading().diffPrimitive(new Long[] {3L, 2L, 6L, 4L});
        new MethodOverloading().diffPrimitive(10L);
    }

    public void demo(int ...a){
        System.out.println(a);
    }
    public void demo(String ...a){
        System.out.println(a);
    }
    //public void fly( int[] members ) {} --> duplicate overloading
    //public void fly( int... members) {}
    public void diffPrimitive( Long arg) {
        System.out.println("Long");
    }
    public void diffPrimitive( Long... arg ) {
        System.out.println("Long varargs");
    }
}
