package com.eazybytes.model;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;

        // greeting new Employee
        System.out.println(this.greetingEmployee());
    }

    private String greetingEmployee() {
        return String.format("Hello %s\n", this.name);
    }
}
