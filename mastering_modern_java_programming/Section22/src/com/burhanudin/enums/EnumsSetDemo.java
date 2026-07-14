package com.burhanudin.enums;

import java.util.EnumSet;

public class EnumsSetDemo {
    public static void main(String[] args) {

        System.out.println("----------------------------------- EnumSet.allOf()");
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        for (Day day : allDays) {
            System.out.println(day);
        }

        System.out.println("----------------------------------- EnumSet.of()");
        EnumSet<Day> someDays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY);
        for (Day day : someDays) {
            System.out.println(day);
        }

        System.out.println("----------------------------------- EnumSet.range()");
        EnumSet<Grades> passGrades = EnumSet.range(Grades.A, Grades.C);
        for (Grades grades : passGrades) {
            System.out.println(grades);
        }

        System.out.println("----------------------------------- EnumSet.complementOf()");
        EnumSet<Grades> failGrades = EnumSet.complementOf(passGrades);
        for (Grades grades : failGrades) {
            System.out.println(grades);
        }
    }
}
