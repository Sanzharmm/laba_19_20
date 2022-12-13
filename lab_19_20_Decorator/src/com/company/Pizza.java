package com.company;

public class Pizza implements Order {
    private double price;
    private String label;

    public Pizza(String name, double price) {
        label = name + ". ";
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
