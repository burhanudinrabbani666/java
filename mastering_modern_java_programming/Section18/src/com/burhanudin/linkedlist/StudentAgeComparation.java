package com.burhanudin.linkedlist;

import java.util.Comparator;

public class StudentAgeComparation implements Comparator<Student> {

    @Override
    public int compare(Student arg0, Student arg1) {
        int ageComparation = Integer.compare(arg1.age, arg0.age);
        return ageComparation;
    }

}
