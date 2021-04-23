package com.ddd.workshop.domain.model;

import java.util.Currency;

public class Product {
    private String name;
    private Currency currency;
    private double price;

    public Product(String name, Currency currency, double price) {
        this.name = name;
        this.currency = currency;
        this.price = price;
    }

    public String getName() {
        return name;
    }
}
