package com.burhanudin.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GeorgianDateDemo {
    public static void main(String[] args) {

        // CALENDAR
        Calendar newCalendar = Calendar.getInstance();

        Date currenDate = newCalendar.getTime();
        System.out.println(currenDate);

        // GREGORIAN CALENDAR
        GregorianCalendar newGregorianCalendar = new GregorianCalendar(2026, Calendar.NOVEMBER, 14);
        System.out.println(newGregorianCalendar.getTime());

        int year = newGregorianCalendar.get(Calendar.YEAR);
        int month = newGregorianCalendar.get(Calendar.MONTH);
        int date = newGregorianCalendar.get(Calendar.DATE);

        System.out.printf("""
                birth Day: %d/%d/%d
                """, date, month + 1, year);

        newGregorianCalendar.set(Calendar.YEAR, 2027);
        newGregorianCalendar.set(Calendar.MONTH, Calendar.JUNE);
        newGregorianCalendar.set(Calendar.DATE, 21);

        Date currenDate2 = newGregorianCalendar.getTime();
        System.out.println(currenDate2);

        // FORMATED DATE
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatedDate = dateFormat.format(newGregorianCalendar.getTime());
        System.out.println(formatedDate);

        newGregorianCalendar.add(Calendar.HOUR, 2);
        newGregorianCalendar.add(Calendar.MONTH, -3);

        formatedDate = dateFormat.format(newGregorianCalendar.getTime());
        System.out.println(formatedDate);

        boolean isLeapYear = newGregorianCalendar.isLeapYear(2048);
        System.out.println(isLeapYear);

        isLeapYear = newGregorianCalendar.isLeapYear(year);
        System.out.println(isLeapYear);
    }

}
