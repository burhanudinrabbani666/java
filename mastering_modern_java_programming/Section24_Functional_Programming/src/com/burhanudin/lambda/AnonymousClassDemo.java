package com.burhanudin.lambda;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        Hello hello = new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Anonymous");
            }
        };

        proces(hello);
        proces(new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Anonymous 2");
            }
        });

    }

    public static void proces(Hello h) {
        h.sayHello();
    }

}
