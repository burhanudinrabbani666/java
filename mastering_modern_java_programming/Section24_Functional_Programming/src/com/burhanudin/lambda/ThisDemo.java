package com.burhanudin.lambda;

public class ThisDemo {
    public static void main(String[] args) {
        ThisDemo thisDemo = new ThisDemo();
        Printer lambaPrinter = thisDemo.getLambaPrinter();
        lambaPrinter.print("Lambda expression");

        Printer annoPrinter = thisDemo.getAnonymousPrinter();
        annoPrinter.print("anno printer");
    }

    public Printer getLambaPrinter() {
        Printer printer = msg -> System.out.println(msg + ": " + this.getClass());
        return printer;
    }

    public Printer getAnonymousPrinter() {
        Printer printer = new Printer() {
            @Override
            public void print(String input) {
                System.out.println(input + ": " + this.getClass());
            }
        };

        return printer;
    }
}
