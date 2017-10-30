package com.zalando.zalando.Model.Entities;

public class Product {
    private String name;
    private String color;
    private int price;
    private int productId;

    public Product() {
    }

    public Product(String name, String color, int price, int productId) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
