package com.company;

public class GasBottle {
    protected double Volume;
    protected double Mass;
    protected double Molar;

    double GetPressure(int T) {
        return AmountOfMatter() * 8.31 * T / Volume;
    }

    double AmountOfMatter() {
        return Mass / Molar;
    }

    public String toString() {
        return "GasBottle {" +
                "Volume=" + Volume +
                ", Mass=" + Mass +
                ", Molar=" + Molar +
                '}';
    }
}
