package com.burhanudin.method.reference;

public class StaticMethodReference {
    public static void main(String[] args) {
        ArihtmeticOperation operation = (a, b) -> {
            int sum = a + b;
            System.out.println(sum);
            return sum;
        };

        operation.performOpearation(14, 14);

        // METHOD REFERENCE
        ArihtmeticOperation methodReference = StaticMethodReference::performAddition;
        methodReference.performOpearation(30, 30);

    }

    public static int performAddition(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;

    }
}
