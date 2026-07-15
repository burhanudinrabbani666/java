package com.burhanudin.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneDateDemo {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));

        String newDate = dateFormat.format(new Date());
        System.out.println(newDate);

        dateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Vatican"));
        newDate = dateFormat.format(new Date());
        System.out.println(newDate);

        GregorianCalendar newGregorianCalendar = new GregorianCalendar(
                TimeZone.getTimeZone("America/New_York"));

        int year = newGregorianCalendar.get(Calendar.YEAR);
        int month = newGregorianCalendar.get(Calendar.MONTH);
        int date = newGregorianCalendar.get(Calendar.DATE);

        System.out.printf("""
                birth Day: %d/%d/%d
                """, date, month + 1, year);

    }
}
