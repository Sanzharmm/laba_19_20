package com.company;

public class ClassAdapter extends GasBottle implements CalculateDp2{

    public ClassAdapter(double volume, double mass, double molar) {
        this.Volume = volume;
        this.Mass = mass;
        this.Molar = molar;
    }

    @Override
    public void ModifVolume(double dV) {
        this.Volume += dV;
    }

    @Override
    public double GetDp(int TO, int T1) {
        return Math.abs(this.GetPressure(TO) - this.GetPressure(T1));
    }

    @Override
    public String Passport() {
        return this.toString();
    }
}
