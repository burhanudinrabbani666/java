package com.burhanudin.date;

import java.util.Date;

public class LegacyDateDemo {
    public static void main(String[] args) {
        // DEPECRATED 👎
        Date date = new Date();
        Date date1 = new Date(200, 8, 26);

        System.out.println(date);
        System.out.println(date1);
    }
}
