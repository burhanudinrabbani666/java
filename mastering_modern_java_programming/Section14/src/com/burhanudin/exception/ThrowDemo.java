package com.burhanudin.exception;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter the numerator value");
            String num1 = scanner.nextLine();

            System.out.println("Please enter the denominator value");
            String num2 = scanner.nextLine();

            Division division = new Division();
            double output = division.divide(num1, num2);
            System.out.println(output);

        } catch (ArithmeticException ex) {
            System.out.println("Division by zero");
        }
    }
}
