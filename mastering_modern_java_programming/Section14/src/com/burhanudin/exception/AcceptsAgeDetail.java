package com.burhanudin.exception;

import java.util.Scanner;

import com.burhanudin.exception.custom.InvalidAgeException;

public class AcceptsAgeDetail {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter your age:");
            int age = scanner.nextInt();

            if (age < 0 || age > 100) {
                scanner.close();
                throw new InvalidAgeException("Invalid age detail. please enter between 0 - 100");
            }

            System.out.println("Your age is: " + age);
        } catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
