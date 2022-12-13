package com.company;

public class Main {

    public static void main(String[] args) {
	    Order fourSeasonsPizza = new Pizza("Pizza", 10);
        fourSeasonsPizza = new RegularExtra("Pepperoni", 4, fourSeasonsPizza);
        fourSeasonsPizza = new DoubleExtra("Mozzarella", 2, fourSeasonsPizza);
        fourSeasonsPizza = new NoCostExtra("Chili", 2, fourSeasonsPizza);
        System.out.println(fourSeasonsPizza.getPrice());
        System.out.println(fourSeasonsPizza.getLabel());


        Order fourSeasonsPizza2 = new Pizza("Pizza", 10);
        fourSeasonsPizza2 = new DoubleExtra("Pepperoni", 4, fourSeasonsPizza2);
        fourSeasonsPizza2 = new DoubleExtra("Mozzarella", 2, fourSeasonsPizza2);
        fourSeasonsPizza2 = new NoCostExtra("Chili", 2, fourSeasonsPizza2);
        System.out.println(fourSeasonsPizza2.getPrice());
        System.out.println(fourSeasonsPizza2.getLabel());
    }
}
