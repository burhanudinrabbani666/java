package com.burhanudin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (scanner) {
            System.out.println("Enter your name: ");
            String name = scanner.next();

            System.out.println("Enter your age: ");
            Integer age = scanner.nextInt();

            System.out.printf("Hello %s you are %d years old.\n", name, age);

        } catch (InputMismatchException e) {
            System.out.println("invalid input");
            System.out.println(e);
        } finally {
            scanner.close();
        }
    }
}
