package com.burhanudin.date;

import java.util.Date;

public class JavaUtilDate {

    static long ONE_DAY_IN_MILLISECOND = 86400000;

    public static void main(String[] args) {
        Date currentDate = new Date(); // current date

        currentDate.setDate(20);
        currentDate.setMonth(10);
        currentDate.setYear(200);

        System.out.println(currentDate);

        long timeInMillisecond = currentDate.getTime();
        System.out.println(timeInMillisecond);

        /** @deprecated */
        @Deprecated
        Date futureDate = new Date(200, 8, 26, 8, 15, 39);
        System.out.println(futureDate); // Sun Sep 26 08:15:39 WIB 2100

        long timeInMillisecond1 = futureDate.getTime();
        System.out.println(timeInMillisecond1);

        Date date1 = new Date(timeInMillisecond1 + ONE_DAY_IN_MILLISECOND);
        System.out.println(date1);

        boolean isAfter = date1.after(futureDate);
        System.out.println(isAfter); // true

    }
}
