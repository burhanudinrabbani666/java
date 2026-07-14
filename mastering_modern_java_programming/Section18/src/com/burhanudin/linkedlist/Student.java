package com.burhanudin.linkedlist;

public class Student implements Comparable<Student> {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("{ name: %s, age: %d }", name, age);
    }

    @Override
    public int compareTo(Student arg0) {
        int ageComparation = Integer.compare(arg0.age, this.age);
        return ageComparation;
    }

}
