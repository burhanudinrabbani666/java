package com.burhanudin.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ToAndAtMethodsDemo {
    public static void main(String[] args) {
        // IMMUTABLE OBJECT
        LocalDateTime dateTime = LocalDateTime.of(2015, Month.DECEMBER, 18, 22, 30);
        System.out.println(dateTime);

        // TO
        LocalDate localDate = dateTime.toLocalDate();
        LocalTime localTime = dateTime.toLocalTime();

        System.out.println(localDate);
        System.out.println(localTime);

        // AT
        LocalDate localDateAt = LocalDate.of(2015, 3, 18);
        LocalDateTime startDayOf = localDateAt.atStartOfDay();
        System.out.println(startDayOf);

        LocalDateTime localDateTime = localDateAt.atTime(18, 20);

        System.out.println(localDateTime);

    }
}
