package com.ddd.workshop.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cart {
    int id;
    private final List<Item> items = new ArrayList<>();
    private final List<Item> deletedItems = new ArrayList<>();

    public Cart(int id) {
        this.id = id;
    }

    public void add(Item item) {
        items.add(item);
        System.out.println("Product successfully added to the cart");
    }

    public void remove(Item item) {
        items.remove(item);
        deletedItems.add(item);
        System.out.println("Product removed from the cart");
    }

    public void displayDeletedItems() {
        deletedItems.forEach(deletedItem -> System.out.println(deletedItem.getProductName()));
    }
}
