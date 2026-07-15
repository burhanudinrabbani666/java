package com.burhanudin.newapi;

import java.time.OffsetTime;
import java.time.ZoneOffset;

public class OffsetTimeDemo {
    public static void main(String[] args) {
        ZoneOffset newYork = ZoneOffset.ofHoursMinutes(-5, 0); // New York

        // 15:30-05:00
        OffsetTime offsetTime = OffsetTime.of(15, 30, 0, 0, newYork);

        int hour = offsetTime.getHour();
        int min = offsetTime.getMinute();
        int sec = offsetTime.getSecond();
        ZoneOffset offset = offsetTime.getOffset();

        OffsetTime laterTime = offsetTime.plusHours(2);
        boolean isBefore = offsetTime.isBefore(laterTime);

        System.out.println(hour);
        System.out.println(min);
        System.out.println(sec);
        System.out.println(offset);
        System.out.println(isBefore);

    }
}
