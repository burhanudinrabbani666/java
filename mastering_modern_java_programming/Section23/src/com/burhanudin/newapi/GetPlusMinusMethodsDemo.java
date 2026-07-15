package com.burhanudin.newapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class GetPlusMinusMethodsDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2015, 3, 18);

        int year = localDate.getYear(); // 2015
        Month month = localDate.getMonth(); // MARCH
        int day = localDate.getDayOfMonth(); // 18
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        System.out.printf(
                "%s %d-%s-%d\n",
                dayOfWeek, day, month, year);

        LocalDateTime localDateTime = LocalDateTime.now();
        int hour = localDateTime.getHour();
        System.out.println(hour);

        LocalDate renewDate = localDate.plusDays(6);
        LocalDate renewMonth = localDate.plusMonths(3);
        LocalDate renewWeek = localDate.plusWeeks(1);

        LocalDate minMonth = localDate.minusMonths(2);
        LocalDate minYear = localDate.minusYears(7);

        System.out.println(renewDate);
        System.out.println(renewMonth);
        System.out.println(renewWeek);
        System.out.println(minMonth);
        System.out.println(minYear);

    }
}
