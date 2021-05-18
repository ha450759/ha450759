package com.ocp.day25;

public class Product {
    private String name; // 品名
    private int price; // 價格

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + '}';
    }
    
}
