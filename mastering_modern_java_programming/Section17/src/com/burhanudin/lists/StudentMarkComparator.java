package com.burhanudin.lists;

import java.util.Comparator;

public class StudentMarkComparator implements Comparator<Student> {

    @Override
    public int compare(Student arg0, Student arg1) {
        int markComparation = Integer.compare(arg0.marks, arg1.marks);
        return markComparation;
    }

}