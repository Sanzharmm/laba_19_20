package com.company;

public class Main {

    public static void main(String[] args) {
	    ObjectAdapter objectAdapter = new ObjectAdapter(3.2, 1.0, 2.0);
        System.out.println(objectAdapter.GetData());
        System.out.println(objectAdapter.Calculate(40, 10));
        objectAdapter.ModifMass(10);
        System.out.println(objectAdapter.GetData());

        System.out.println("-------------------------------------------------------------");

        ClassAdapter classAdapter = new ClassAdapter(3.2, 1.0, 2.0);
        System.out.println(classAdapter.Passport());
        System.out.println(classAdapter.GetDp(40, 35));
        classAdapter.ModifVolume(5);
        System.out.println(classAdapter.Passport());

    }
}
