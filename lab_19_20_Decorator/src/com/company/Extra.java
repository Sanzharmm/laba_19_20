package com.company;

public abstract class Extra implements Order {
    protected double price;
    protected String label;

    public Extra (String label, int price, Order pizza) {
        this.price = pizza.getPrice();
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
