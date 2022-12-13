package com.company;

public class DoubleExtra extends Extra {
    public DoubleExtra(String label, int price, Order pizza) {
        super(label, price, pizza);
        this.price += price + price;
        this.label = pizza.getLabel() + "Double " + label + ". ";
    }
}
