package com.burhanudin.date;

import java.sql.Date;

public class SqlDateDemo {
    public static void main(String[] args) {
        java.util.Date currentDate = new java.util.Date(System.currentTimeMillis());

        Date sqlDate = new Date(System.currentTimeMillis());
        // Date sqlDate2 = new Date(currentDate);

        System.out.println(sqlDate); // 2026-07-15
        System.out.println(currentDate); // Wed Jul 15 08:16:26 WIB 2026

    }
}
