package com.burhanudin.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();

        students.add(new Student("bani", 23));
        students.add(new Student("aziz", 27));
        students.add(new Student("risaldi", 26));
        students.add(new Student("farhan", 24));

        students.sort(new StudentAgeComparation());
        System.out.println(students);

    }
}
