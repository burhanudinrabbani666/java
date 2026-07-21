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

        // ifPresent
        message2.ifPresent(System.out::println);

        // ifPresentOrElse
        message2.ifPresentOrElse(
                msg -> System.out.println("ifPresentOrElse: " + msg.toUpperCase()),
                () -> System.out.println("Value is absent"));

        // orElse
        String msg1 = message2.orElse("orElse: Value is absent"); // <- default value
        System.out.println(msg1);

        // orElse
        String msg2 = message2.orElseGet(() -> "orElseGet: value is absent");
        System.out.println(msg2);

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
