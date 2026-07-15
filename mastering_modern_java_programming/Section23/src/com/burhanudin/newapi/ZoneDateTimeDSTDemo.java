package com.burhanudin.newapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDSTDemo {

    public static void main(String[] args) {
        // flight deparatury in PST
        ZonedDateTime departure = ZonedDateTime.of(2024, 3, 9, 21, 0, 0, 0, ZoneId.of("America/Los_Angeles"));

        // expected arrival in NYC (assumming duration is 4 hours)
        ZonedDateTime arrival = departure.plusHours(4).withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("Deparute(PST): " + departure);
        System.out.println("Arrival(EST): " + arrival);

        ZonedDateTime londonStartTime, londonEndTime, newYorkStartTime, newYorkEndTime;

        // Write your logic below
        londonStartTime = ZonedDateTime.of(2024, 10, 15, 14, 0, 0, 0, ZoneId.of("Europe/London"));
        londonEndTime = londonStartTime.plusHours(2);

        newYorkStartTime = londonEndTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        newYorkEndTime = newYorkStartTime.plusHours(2);

        System.out.println("Conference Call Start Time (London): " + londonStartTime);
        System.out.println("Conference Call End Time (London): " + londonEndTime);
        System.out.println("Conference Call Start Time (New York): " + newYorkStartTime);
        System.out.println("Conference Call End Time (New York): " + newYorkEndTime);

    }
}