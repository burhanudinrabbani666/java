package com.burhanudin.streams;

public class Item {
    private String name;
    private double price;
    private boolean inStock;
    private boolean inSale;

    public Item(String name, double price, boolean inStock, boolean inSale) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.inSale = inSale;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public boolean isInSale() {
        return inSale;
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", price=" + price + ", inStock=" + inStock + ", inSale=" + inSale + "]";
    }

}
