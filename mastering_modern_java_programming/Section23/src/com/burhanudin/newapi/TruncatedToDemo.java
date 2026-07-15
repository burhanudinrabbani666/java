package com.burhanudin.newapi;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TruncatedToDemo {
    public static void main(String[] args) {
        Duration duration = Duration
                .ofDays(2)
                .plusHours(6)
                .plusMinutes(56)
                .plusSeconds(19);

        Duration daysTruncated = duration.truncatedTo(ChronoUnit.DAYS);
        Duration hoursTruncated = duration.truncatedTo(ChronoUnit.HOURS);
        Duration minutesTruncated = duration.truncatedTo(ChronoUnit.MINUTES);

        System.out.println(duration); // PT54H56M19S

        System.out.println(daysTruncated); // PT48H
        System.out.println(hoursTruncated); // PT54H
        System.out.println(minutesTruncated); // PT54H56M

    }
}
