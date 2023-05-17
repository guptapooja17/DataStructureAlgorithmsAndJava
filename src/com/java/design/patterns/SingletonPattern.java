package com.java.design.patterns;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonPattern {
    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Student s1 = Student.getRef();
        Student s2 = Student.getRef();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("_______Thread Safe_____");
        SingletonThreadSafe obj1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe obj2 = SingletonThreadSafe.getInstance();
        System.out.println(obj1.equals(obj2));


        System.out.println("_______Break Singleton behavior_____");
        // Using clone
//        Student s3 = (Student) s1.clone();
//        System.out.println(s1.hashCode());
//        System.out.println(s3.hashCode());

        //Using reflection
        Student refelectionInstance=null;
        Constructor[] constructors = Student.class.getDeclaredConstructors();

        for(Constructor c : constructors) {
            c.setAccessible(true);
            refelectionInstance = (Student) c.newInstance();
        }

        System.out.println(refelectionInstance.hashCode());
    }
}
class Student extends MyClone implements Serializable {
    // Private instance of the singleton class
    private static Student ref;

    // Private constructor to prevent instantiation from outside the class
    private Student() {
        // for reflection break solution
        if (ref != null) {
            throw new IllegalStateException("Object can't be created using reflection");
        }
    }
    // Public method to get the singleton instance
    public static Student getRef() {
        if (ref == null){
            ref = new Student();
        }
        return ref;
    }
    // Other methods of the class can be added here

    // To do not allow anyone to make new instance via cloneable we have to override clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException("Cannot clone singleton class object");
    }
 }
class MyClone implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}