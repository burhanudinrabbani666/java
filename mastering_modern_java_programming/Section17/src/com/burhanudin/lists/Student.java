package com.burhanudin.lists;

public class Student implements Comparable<Student> {
    String name;
    int rollNumber;
    int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return String.format("""
                Student { "name": "%s", "roolNumber": "%d", "marks": "%d" }
                """, name, rollNumber, marks);
    }

    @Override
    public int compareTo(Student arg0) {
        int markComparation = Integer.compare(this.marks, arg0.marks);

        if (markComparation == 0) {
            return Integer.compare(this.rollNumber, arg0.rollNumber);
        }

        return markComparation;
    }

}
