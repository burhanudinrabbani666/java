package com.burhanudin.lambda;

public class LambdaExpressionDemo {
    public static void main(String[] args) {

        // APPROACH 1
        Hello hello = () -> System.out.println("Hello");
        Hello hello1 = () -> System.out.println("Hello World");

        proces(hello);
        proces(hello1);

        // APPROACH 2
        proces(() -> System.out.println("Hi People"));

        ArithmeticInterface addition = (a, b) -> a + b;
        System.out.println(addition.operation(10, 5));

        ArithmeticInterface subtraction = (a, b) -> a - b;
        System.out.println(subtraction.operation(10, 5));

        ArithmeticInterface product = (a, b) -> a * b;
        System.out.println(product.operation(10, 5));

        ArithmeticInterface divison = (a, b) -> a / b;
        System.out.println(divison.operation(10, 5));

    }

    public static void proces(Hello h) {
        h.sayHello();

    }
}
