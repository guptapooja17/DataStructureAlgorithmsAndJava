package com.java.design.patterns;

public class SingletonThreadSafe {

    //innerclass solution highly efficient: "Initialization-on-demand holder idiom"
    private SingletonThreadSafe () {}
    private static class SingletonHelper {
        private static SingletonThreadSafe obj = new SingletonThreadSafe();
    }
    public static SingletonThreadSafe getInstance() {
        return SingletonHelper.obj;
    }



    // another way
    //Synchronized for thread safety
    private static SingletonThreadSafe obj;
    public static SingletonThreadSafe getInstance1() {
        if(obj == null) {
            synchronized (SingletonThreadSafe.class) {
                if ( obj == null) {
                    obj = new SingletonThreadSafe();
                }
            }
        }
        return obj;
    }
}
