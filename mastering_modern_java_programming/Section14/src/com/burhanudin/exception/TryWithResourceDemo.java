package com.burhanudin.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourceDemo {
    public static void main(String[] args) {

        // this is automatically close: java 7+
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a numeric number...");
            int number = scanner.nextInt();
            System.out.println("user input number: " + number);

        } catch (InputMismatchException ex) {
            System.out.println("""
                    invalid data input. required numeric number.
                    """);
            ex.printStackTrace();

        }

    }
}
