package com.burhanudin.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectaAndThenDemo {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("apple", 199),
                new Product("samsung", 149),
                new Product("xiaomi", 99),
                new Product("nokia", 149));

        String maxPriceProduct = products.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Product::getPrice)),
                        (product) -> product.isPresent() ? product.get().getName() : "None"));

        System.out.println(maxPriceProduct);

    }
}
