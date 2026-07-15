package com.burhanudin.newapi;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {
    public static void main(String[] args) {
        Instant thousandSecondAfterEpoch = Instant.ofEpochSecond(1000);
        System.out.println(thousandSecondAfterEpoch);

        Instant currentDate = Instant.now();
        System.out.println(currentDate);

        long seconds = currentDate.getEpochSecond();
        System.out.println(seconds);

        int nanos = currentDate.getNano();
        System.out.println(nanos);

        Duration d1 = Duration.ofDays(5);
        Duration d2 = Duration.ofMinutes(10);
        Duration d3 = Duration.ofSeconds(30);
        Duration d4 = Duration.ofSeconds(-30);

        Duration d5 = d3.plus(d4);
        System.out.println(d5);

        Instant i3 = thousandSecondAfterEpoch.plus(d1);
        Instant i4 = currentDate.minus(d2);

        System.out.println(i3);
        System.out.println(i4);

        boolean isAfter = i3.isAfter(i4);
        boolean isBefore = i3.isBefore(i4);

        System.out.println(isAfter);
        System.out.println(isBefore);

        Duration duration = Duration.between(thousandSecondAfterEpoch, i3);
        System.out.println(duration);
    }
}
