package com.burhanudin.newapi;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffSetDateTimeDemo {
    public static void main(String[] args) {
        // ZONEOFFSET
        ZoneOffset offset = ZoneOffset.ofHoursMinutes(7, 0); // Jakarta
        ZoneOffset destOffset = ZoneOffset.ofHoursMinutes(-5, 0); // New York

        // OFFSETDATETIME
        OffsetDateTime offsetDateTime = OffsetDateTime.now(offset);
        OffsetDateTime destOffsetDateTime = offsetDateTime.withOffsetSameInstant(destOffset);

        System.out.println(offsetDateTime);
        System.out.println(destOffsetDateTime);

    }
}
