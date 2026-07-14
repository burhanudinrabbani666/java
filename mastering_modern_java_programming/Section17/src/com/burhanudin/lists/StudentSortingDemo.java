package com.burhanudin.lists;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortingDemo {
    public static void main(String[] args) {

        // Comprable
        var students = new ArrayList<Student>();

        students.add(new Student("bani", 14, 90));
        students.add(new Student("risaldi", 20, 70));
        students.add(new Student("aziz", 01, 85));
        students.add(new Student("farhan", 10, 90));

        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);

        // --------------------------------------------------------------

        var students1 = new ArrayList<Student>();

        students1.add(new Student("bani", 14, 90));
        students1.add(new Student("risaldi", 20, 70));
        students1.add(new Student("aziz", 01, 85));
        students1.add(new Student("farhan", 10, 90));

        // Collections.sort(students1, new StudentComparator());
        students1.sort(new StudentComparator());
        System.out.println(students1);
    }
}
