package com.company;

public class BeachRest extends Trip {

    @Override
    public float calculatePrice() {
        return 1000 * this.calcCountry() * this.getHotelStars() * this.calcFeeding() * this.getDays();
    }
}
