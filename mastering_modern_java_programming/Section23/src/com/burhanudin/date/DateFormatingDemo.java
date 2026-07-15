package com.burhanudin.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatingDemo {
    public static void main(String[] args) throws ParseException {
        Date currentDate = new Date();
        System.out.println(currentDate);

        // DATE FORMAT
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatedDate = dateFormat.format(currentDate);
        System.out.println(formatedDate);

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
        String formatedDate1 = dateFormat1.format(currentDate);
        System.out.println(formatedDate1);

        // PARSING
        String dateString = "2100-09-26 14:30:00";
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parseDate = dateFormat2.parse(dateString);
        System.out.println(parseDate);

    }
}
