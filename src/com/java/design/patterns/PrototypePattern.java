package com.java.design.patterns;

public class PrototypePattern {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        Shape circleClone = (Shape) circle.clone();
        circleClone.draw();
    }
}
 abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public abstract void draw();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

class Circle extends Shape {
    private int x, y, radius;

    public Circle() {
        type = "Circle";
    }

    public void draw() {
        System.out.println("Drawing Circle");
    }
}

