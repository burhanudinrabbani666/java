package com.burhanudin.newapi;

import java.time.LocalDate;
import java.time.chrono.HijrahDate;

public class NonIsoDateDemo {
    public static void main(String[] args) {
        HijrahDate hijrahDateNow = HijrahDate.now();
        System.out.println(hijrahDateNow);

        // convert Hijriah to ISO date and vice versa
        LocalDate isoNow = LocalDate.now();
        HijrahDate hijrahDateNow1 = HijrahDate.from(isoNow);
        LocalDate isoNow2 = LocalDate.from(hijrahDateNow1);

        System.out.println(hijrahDateNow1);
        System.out.println(isoNow2);
    }
}
