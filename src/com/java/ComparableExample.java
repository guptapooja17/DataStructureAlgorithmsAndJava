package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1, "Alice"));
        emp.add(new Employee(2, "Charlie"));
        emp.add(new Employee(3, "Bob"));

        Employee emp1 = new Employee(700000,"Pooja" ),
                emp2 = new Employee(10000000,"Kunal");

        System.out.println("Before " + emp);
        Collections.sort(emp);

        System.out.println("After " + emp);

        emp1.compareTo(emp2);
    }
}

class Employee implements Comparable<Employee>{
     Integer id;
     String name;
    
    public Employee() {
    }
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
      return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
