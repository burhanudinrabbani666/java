package com.burhanudin.streams;

import java.util.List;
import java.util.Optional;

public class FindMatchDemo {
    public static void main(String[] args) {
        List<Item> items = getItems();

        // MATCH
        boolean allInStock = items.stream().allMatch(Item::isInStock);
        System.out.println(allInStock);

        boolean anyOnSale = items.stream().anyMatch(Item::isInSale);
        System.out.println(anyOnSale);

        boolean allNotInStock = items.stream().noneMatch(Item::isInStock);
        System.out.println(allNotInStock);

        // FIND
        Optional<Item> priceGrt1000Random = items.stream()
                .filter(item -> item.getPrice() > 1000)
                .findAny();

        System.out.println(priceGrt1000Random);

    }

    private static List<Item> getItems() {
        return List.of(
                new Item("laptop", 1200, true, false),
                new Item("smartphone", 800, true, true),
                new Item("headphones", 150, false, true),
                new Item("camera", 2000, true, false),
                new Item("samrtwatch", 300, true, false));
    }
}
