package com.burhanudin;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeScannerDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        try (scanner) {

            System.out.println("please enter first numeric value to identify if it is a prime value: ");
            Integer input = scanner.nextInt();
            Boolean isPrime = isPrime(input);

            if (isPrime) {
                System.out.println("Given number is prime number");
            } else {
                System.out.println("Given number is not prime number");
            }

            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("invalid input");
        } finally {
            scanner.close();
        }
    }

    private static Boolean isPrime(Integer num) {
        if (num < 1) {
            return false;
        }

        for (Integer i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
