package com.burhanudin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderSumDemo {
    public static void main(String[] args) throws IOException, NumberFormatException {
        InputStreamReader inpStream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inpStream);
        try {
            System.out.println("please enter first numeric value: ");
            String firstInput = reader.readLine();

            System.out.println("please enter second numeric value: ");
            String secondInput = reader.readLine();

            Integer num1 = Integer.parseInt(firstInput);
            Integer num2 = Integer.parseInt(secondInput);
            Integer result = num1 + num2;

            System.out.println("the sum of two given numbers is: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. please enter numeric value...");
        } finally {
            reader.close(); // should be close connection for not memory leak
        }

    }
}
