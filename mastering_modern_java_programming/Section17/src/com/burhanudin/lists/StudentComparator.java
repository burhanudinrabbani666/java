package com.burhanudin.lists;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student arg0, Student arg1) {
        int markComparation = Integer.compare(arg0.marks, arg1.marks);

        if (markComparation == 0) {
            return Integer.compare(arg0.rollNumber, arg1.rollNumber);
        }

        return markComparation;

    }

}
