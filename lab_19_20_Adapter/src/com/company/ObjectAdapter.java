package com.company;

public class ObjectAdapter implements CalculateDp {
    private GasBottle gasBottle;

    public ObjectAdapter(double volume, double mass, double molar) {
        gasBottle = new GasBottle();
        gasBottle.Volume = volume;
        gasBottle.Mass = mass;
        gasBottle.Molar = molar;
    }

    @Override
    public double Calculate(int TO, int dT) {
        return Math.abs(gasBottle.GetPressure(TO) - gasBottle.GetPressure(TO + dT));
    }

    @Override
    public void ModifMass(double dm) {
        gasBottle.Mass += dm;
    }

    @Override
    public String GetData() {
        return gasBottle.toString();
    }
}
