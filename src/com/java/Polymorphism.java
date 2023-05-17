package com.java;

class Animal {
    public static void eat() { System.out.println("This animal is eating."); }
    public void makeSound() { System.out.println("This animal makes a sound."); }
    public void run() { System.out.println("This animal is running."); }
}
class Dog extends Animal {
    public static void eat() { System.out.println("This dog is eating."); }
    public void makeSound() { System.out.println("The dog barks."); }
    public void bark() { System.out.println("Woof woof!"); }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();

        System.out.println("______UP CASTING________");
        Animal animal_2 = new Dog();   // animal_2 = (Animal) dog; both are same example of UP CASTING
        animal_2.eat();
        animal_2.makeSound();
        animal_2.run();

        System.out.println("______DOWN CASTING________");
        if (animal instanceof Dog) {
            Dog dog_2 = (Dog) animal;
            dog_2.eat();
            dog_2.makeSound();
            dog_2.bark();
        }
    }
}

