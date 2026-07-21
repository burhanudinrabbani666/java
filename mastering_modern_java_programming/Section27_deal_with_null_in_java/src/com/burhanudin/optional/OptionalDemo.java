package com.burhanudin.optional;

import java.util.Random;

public class OptionalDemo {
    public static void main(String[] args) {
        String message = sayHello();

        // primitive
        if (message != null) {
            System.out.println(message.toUpperCase());
        }

    }

    public static String sayHello() {
        int randomNum = new Random().nextInt(10);
        System.out.println(randomNum);

        if (randomNum % 2 == 0) {
            return "Hello World";
        }

        return null;
    }
}
