package org.camilo.example;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Product {

    private String name;

    private double price;

    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

}
