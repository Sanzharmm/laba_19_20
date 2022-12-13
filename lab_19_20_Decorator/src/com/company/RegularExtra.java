package com.company;

public class RegularExtra extends Extra {
    public RegularExtra(String label, int price, Order pizza) {
        super(label, price, pizza);
        this.price += price;
        this.label = pizza.getLabel() + label + ". ";
    }

}
