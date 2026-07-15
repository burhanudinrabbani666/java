package com.burhanudin.newapi;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneDemo {
    public static void main(String[] args) {
        // Set<String> allZones = ZoneId.getAvailableZoneIds();
        // System.out.println(allZones);

        ZoneId zone = ZoneId.of("Asia/Jakarta");
        ZoneId destZone = ZoneId.of("Europe/Moscow");

        ZonedDateTime date = ZonedDateTime.now(zone);
        ZonedDateTime destDate = date.withZoneSameInstant(destZone);

        System.err.println(date);
        System.out.println(destDate);

        // OFFSET
        ZoneOffset offset = ZoneOffset.ofHoursMinutes(7, 0); // Jakarta
        ZoneOffset destOffset = ZoneOffset.ofHoursMinutes(-5, 0); // New York

        ZonedDateTime utc2DateTime = ZonedDateTime.now(offset);
        ZonedDateTime utc2DestTime = date.withZoneSameInstant(destOffset);
        System.out.println(utc2DateTime);
        System.out.println(utc2DestTime);

    }
}
