package com.burhanudin.optional;

import java.util.Optional;
import java.util.Random;

public class OptionalDemo {
    public static void main(String[] args) {
        String message = sayHello();

        // PRIMITIVE
        if (message != null) {
            System.out.println(message.toUpperCase());
        }

        Optional<String> message2 = sayHi();

        // validate with isEmpty() before get()
        if (!message2.isEmpty()) {
            System.out.println(message2
                    .get().toUpperCase());
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

    public static Optional<String> sayHi() {
        int randomNum = new Random().nextInt(10);
        String msg = null;

        if (randomNum % 2 == 0) {
            msg = "Hi World";
        }

        System.out.println(randomNum);
        return Optional.ofNullable(msg);
    }

}
