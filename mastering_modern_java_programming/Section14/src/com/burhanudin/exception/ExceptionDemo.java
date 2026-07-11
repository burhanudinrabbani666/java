package com.burhanudin.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        try (scanner) {
            System.out.println("Enter a number...");
            Integer number = scanner.nextInt();
            System.out.println("user input number: " + number);
        } catch (InputMismatchException ex) {
            System.out.println("invalid data input. required numeric number.");
            ex.printStackTrace();
        } finally {
            scanner.close();
        }

    }
}
