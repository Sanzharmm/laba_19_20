package com.company;

public abstract class Trip {
    private int days;
    private Country country;
    private int hotelStars;
    private Feeding feeding;

    public abstract float calculatePrice();

    protected float calcCountry(){
        switch (country) {
            case USA:
                return 3.5f;
            case Kyrgyzstan:
                return 0.8f;
            case China:
                return 2.8f;
            case Russia:
                return 2f;
            case Germany:
                return 3f;
        }
        return 0f;
    }

    protected float calcFeeding() {
        switch (feeding) {
            case TwoTimes:
                return 1f;
            case ThreeTimes:
                return 1.5f;
            case AllInclusive:
                return 2.5f;
        }
        return 0f;
    }



    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getHotelStars() {
        return hotelStars;
    }

    public void setHotelStars(int hotelStars) {
        this.hotelStars = hotelStars;
    }

    public Feeding getFeeding() {
        return feeding;
    }

    public void setFeeding(Feeding feeding) {
        this.feeding = feeding;
    }
}
