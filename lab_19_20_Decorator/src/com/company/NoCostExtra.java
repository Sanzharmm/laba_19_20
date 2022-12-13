package com.company;

public class NoCostExtra extends Extra {
    public NoCostExtra(String label, int price, Order pizza) {
        super(label, price, pizza);
        this.label = pizza.getLabel() + label + ". ";
    }
}
