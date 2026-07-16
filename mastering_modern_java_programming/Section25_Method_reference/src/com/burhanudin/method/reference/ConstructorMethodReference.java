package com.burhanudin.method.reference;

public class ConstructorMethodReference {
    public static void main(String[] args) {
        ProductInterface productInterface1 = (name, price) -> new Product(name, price);
        System.out.println(productInterface1.getProduct("Bakso", 140000));

        ProductInterface productInterface = Product::new;
        Product product = productInterface.getProduct("Nasi padang", 20000);
        System.out.println(product);
    }
}
