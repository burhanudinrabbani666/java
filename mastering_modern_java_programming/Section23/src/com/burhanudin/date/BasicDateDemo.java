package com.burhanudin.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BasicDateDemo {
    public static void main(String[] args) {

        // JAVA 8+
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(Instant.now());

    }
}
