package com.java;

import java.util.*;
import java.util.stream.Collectors;

public final class ImmutableClass {
    private final String name;
    private final Date date;
    private final List<String> mobile;
    private final Employee emp;

    public ImmutableClass(String name, Date date, List<String> mobile, Employee emp) {
        this.date = date;
        this.name = name;
        this.mobile = mobile;
        this.emp = emp;
    }
    public String getName() {
        return name;
    }

    public List<String> getMobile() {
        return new ArrayList<String>(mobile); //return Collections.unmodifiableList(mobile); //
    }

    public Date getDate() {
        return (Date) date.clone();
    }

    public Employee getEmp() {
        return new Employee(emp.getId(), emp.getName());
    }

    @Override
    public String toString() {
        return "ImmutableEmployee{" +
                "date=" + date +
                ", Empoyee= " + emp +
                ", name='" + name + '\'' +
                ", mobile=" + mobile +
                '}';
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101,"Arayn");
        ImmutableClass obj = new ImmutableClass("Pooja", new Date(), Arrays.stream(new String[] {"1023567", "3542789", "4565790"}).collect(Collectors.toList()), emp);
        System.out.println(obj);

        obj.getDate().setDate(30);
        System.out.println(obj);

        obj.getMobile().add("12345689");
        System.out.println(obj);

        obj.getEmp().setName("Chiku"); // not changed
        // obj.emp.name = "Nikhil"; // it will break immutability, so make Employee fields private
        System.out.println(obj);

        Set<String> s =  new HashSet<>();
        System.out.println(s.add("p"));
        System.out.println(s.add("p"));
        System.out.println(s.add("pa"));
        System.out.println(s.add("p"));
        System.out.println(s.add(null));
        System.out.println(s.add(null));
    }
}


