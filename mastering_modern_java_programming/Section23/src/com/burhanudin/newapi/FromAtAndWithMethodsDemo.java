package com.burhanudin.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class FromAtAndWithMethodsDemo {

    public static void main(String[] args) {

        // IMMUTABLE OBJECT
        LocalDateTime dateTime = LocalDateTime.of(2015, Month.DECEMBER, 18, 22, 30);
        System.out.println(dateTime);

        // FROM
        LocalDate derivedDate = LocalDate.from(dateTime);
        LocalTime derivedTime = LocalTime.from(dateTime);

        System.out.println(derivedDate);
        System.out.println(derivedTime);

        LocalDateTime updatedContent = dateTime.withYear(2030);
        LocalDateTime updatedContent2 = updatedContent.withMonth(10);

        System.out.println(updatedContent);
        System.out.println(updatedContent2);

    }
}
