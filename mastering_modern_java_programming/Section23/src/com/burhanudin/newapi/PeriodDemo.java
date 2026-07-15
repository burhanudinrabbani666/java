package com.burhanudin.newapi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2013, 1, 1);
        LocalDate localDate2 = LocalDate.of(2015, 3, 18);

        Period period = Period.between(localDate1, localDate2);
        System.out.println(period);

        Period oneYearWithTwoMonth = Period.of(1, 2, 0);
        System.out.println(oneYearWithTwoMonth);

        Period threeDays = Period.ofDays(8);
        System.out.println(threeDays);

        LocalDate localDate3 = localDate1.plus(oneYearWithTwoMonth);
        System.out.println(localDate3);
    }
}
