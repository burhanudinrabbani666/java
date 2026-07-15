package com.burhanudin.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormaterDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2015, 3, 18);
        LocalTime localTime = LocalTime.of(15, 30, 0);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        // 2015/03/18
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formatedDate = dateFormatter.format(localDate);
        System.out.println(formatedDate);

        // 3:30 PM
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");
        String formatedTime = timeFormatter.format(localTime);
        System.out.println(formatedTime);

        // 18/03/2015 3:30 PM
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy h:mm a");
        String formatedDateTime = dateTimeFormatter.format(localDateTime);
        System.out.println(formatedDateTime);

        // 20150318
        String formatedDate1 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(formatedDate1);

        // 18. März 2015
        DateTimeFormatter germanFormatter = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.GERMANY);
        String formattedGermanDate = localDate.format(germanFormatter);
        System.out.println(formattedGermanDate);
    }
}
