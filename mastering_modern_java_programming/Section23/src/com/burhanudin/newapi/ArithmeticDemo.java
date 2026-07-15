package com.burhanudin.newapi;

import java.time.Duration;
import java.time.Period;

public class ArithmeticDemo {
    public static void main(String[] args) {
        Duration originalDuration = Duration.ofMinutes(30);

        Duration multipleDuration = originalDuration.multipliedBy(5);
        Duration divideDuration = originalDuration.dividedBy(10);
        Duration negatedDuration = originalDuration.negated();

        System.out.println(multipleDuration); // PT2H30M
        System.out.println(divideDuration); // PT3M
        System.out.println(negatedDuration); // PT-30M

        Period originalPeriod = Period.ofDays(3);
        Period multiplePeriod = originalPeriod.multipliedBy(5);
        Period negatedPeriod = originalPeriod.negated();

        System.out.println(originalPeriod); // P3D
        System.out.println(multiplePeriod); // P15D
        System.out.println(negatedPeriod); // P-3D

    }
}
