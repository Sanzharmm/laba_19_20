package com.company;

public class MountainSki extends Trip {

    @Override
    public float calculatePrice() {
        return 2000 * this.calcCountry() * this.getHotelStars() * this.calcFeeding() * this.getDays();
    }
}
