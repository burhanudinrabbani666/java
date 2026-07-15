package com.burhanudin.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class OfMethodDemo {
    public static void main(String[] args) {

        LocalDate newDate = LocalDate.of(2002, Month.NOVEMBER, 14);
        LocalTime newTime = LocalTime.of(15, 8);
        LocalDateTime newDateTime = LocalDateTime.of(newDate, newTime);

        ZoneId newYorkId = ZoneId.of("America/New_York");
        ZonedDateTime newZonedDateTime = ZonedDateTime.of(newDateTime, newYorkId);

        System.out.println(newDate);
        System.out.println(newTime);
        System.out.println(newDateTime);
        System.out.println(newZonedDateTime);

        LocalDate someDate = LocalDate.ofEpochDay(1000);
        LocalDate dayIn2000 = LocalDate.ofYearDay(2000, 200);

        System.out.println(someDate);
        System.out.println(dayIn2000);

    }
}
