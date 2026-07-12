package com.burhanudin.exception;

import java.util.logging.Logger;

public class MultipleCatchDemo {

    private static Logger logger = Logger.getLogger(
            MultipleCatchDemo.class.getName());

    public static void main(String[] args) {
        String input = null;
        try {
            input = "burhanudin";
            input = input.toUpperCase();

            logger.info(input);
            input = input.substring(1, 14);
            logger.info(input);

        } catch (NullPointerException ex) {
            logger.severe("""
                    an null pointer execption occurred.
                    please check your data
                    """);

            // pipe symbol: java 7+ only
        } catch (
                StringIndexOutOfBoundsException
                | ArrayIndexOutOfBoundsException ex) {
            logger.severe("""
                    IndexOutOfBoundsException exception occurred.
                    please check your input data
                        """);

        } catch (Exception ex) {
            logger.severe("""
                    an exception occured. please check your program
                    """);

        }
    }
}
