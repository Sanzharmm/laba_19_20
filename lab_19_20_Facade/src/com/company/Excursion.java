package com.company;

public class Excursion extends Trip {

    @Override
    public float calculatePrice() {
        return 1500 * this.calcCountry() * this.getHotelStars() * this.calcFeeding() * this.getDays();
    }
}
