package com.burhanudin.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupinByDemo {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("apple", 199),
                new Product("samsung", 199),
                new Product("xiaomi", 99),
                new Product("nokia", 149),
                new Product("oppo", 99),
                new Product("blackberry", 149));

        Map<Integer, List<Product>> groupByPrice = products
                .stream()
                .collect(Collectors.groupingBy(Product::getPrice));

        System.out.println("group by price: " + groupByPrice);

    }
}
