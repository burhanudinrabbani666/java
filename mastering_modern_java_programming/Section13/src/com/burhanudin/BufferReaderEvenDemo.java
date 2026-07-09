package com.burhanudin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEvenDemo {
    public static void main(String[] args) throws IOException, NumberFormatException {
        InputStreamReader inpStream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inpStream);
        try {
            System.out.println("Please enter numeric number: ");
            String input = reader.readLine();
            Integer num = Integer.parseInt(input);

            if (num % 2 == 0) {
                System.out.println("You have enter even number.");
            } else {
                System.out.println("You have enter odd number.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. please enter numeric value...");
        } finally {
            reader.close(); // should be close connection for not memory leak
        }

    }
}
