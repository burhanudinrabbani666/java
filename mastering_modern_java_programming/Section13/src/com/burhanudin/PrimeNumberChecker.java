package com.burhanudin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberChecker {
    public static void main(String[] args) throws IOException, NumberFormatException {
        InputStreamReader inpStream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inpStream);

        System.out.println("please enter first numeric value to identify if it is a prime value: ");
        String input = reader.readLine();
        Integer num = Integer.parseInt(input);
        Boolean isPrime = isPrime(num);

        if (isPrime) {
            System.out.println("Given number is prime number");
        } else {
            System.out.println("Given number is not prime number");
        }

        reader.close();
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
