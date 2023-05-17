package com.java;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        Employee emp1 = new Employee(700000,"Pooja" ),
                 emp2 = new Employee(10000000,"Kunal"),
                 emp3 = new Employee(500000,"Poonam" );

        List<Employee> emp = new ArrayList<>();
            emp.add(new Employee(1, "Alice"));
            emp.add(new Employee(2, "Charlie"));
            emp.add(new Employee(3, "Bob"));
            emp.add(new Employee(8, "Charle"));
            emp.add(new Employee(7, "Kunal"));


        Comparator<Employee> byname = (e1, e2) -> { return e1.name.compareTo(e2.name); };
        Comparator<Employee> byId = (e1, e2) -> { return e1.id.compareTo(e2.id); };

        System.out.println("byname Comparing Comparator " + byname.compare(emp1, emp2));
        System.out.println("byId Comparing Comparator " + byId.compare(emp1, emp2));

        //collect of employee an be sort using below
        Collections.sort(emp, byname);
        System.out.println("Originally sorted by name : " + emp);

        try {
            System.out.println(byname.compare(emp1, null));
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        /* Returns a comparator that imposes the reverse ordering of this comparator. */
        Comparator<Employee> reverseOrder = byname.reversed();
        Collections.sort(emp,reverseOrder);
        System.out.println("Reverse list by name : " + emp);


        Comparator<Employee> thenCompareEample = byId.thenComparing(byname);
        Collections.sort(emp, thenCompareEample);
        System.out.println("thenCompare use : " + emp);


        // How to handle null, comparator has static method nullfirst / nulllast for such situation

        /*
         * null to be less than non-null. When both are null, they are considered equal.
         * If both are non-null, the specified Comparator is used to determine the order. If the specified comparator is null,
         * then the returned comparator considers all non-null values to be equal.
         */
        Comparator<Employee> byNameHandleNull = Comparator.comparing(Employee::getName, Comparator.nullsFirst(String::compareTo));
        emp.add(new Employee(5, null));
        emp.add(new Employee(4, null));
        Collections.sort(emp, byNameHandleNull);
        System.out.println("Null handle" + emp);

        /*
         * Returns a null-friendly comparator that considers null to be greater than non-null. When both are null, they are considered equal.
         * If both are non-null, the specified Comparator is used to determine the order. If the specified comparator is null,
         * then the returned comparator considers all non-null values to be equal.
         */
        Comparator<Employee> bynullComparator2 = Comparator.nullsLast(byname);
    }
}
