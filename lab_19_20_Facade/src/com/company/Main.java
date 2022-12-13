package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Target target = new Target();
        Facade facade = new Facade(target);
        System.out.println("1. Пляжный отдых");
        System.out.println("2. Горные лыжи");
        System.out.println("3. Экскурсия");
        System.out.println("Введите вид путевки: ");
        int type = in.nextInt();
        System.out.println("Введите длительность: ");
        int days = in.nextInt();
        System.out.println("1. Kyrgyzstan,\n" +
                "2. Russia\n" +
                "3. USA\n" +
                "4. Germany\n" +
                "5. China");
        System.out.println("Введите страну: ");
        int country = in.nextInt();
        System.out.println("Введите количество звезд отеля: ");
        int stars = in.nextInt();
        System.out.println("1. Два раза\n" +
                "2. Три раза\n" +
                "3. Все включено");
        System.out.println("Введите рацион питания: ");
        int feeding = in.nextInt();
        facade.setTrip(type, days, getCountry(country), stars, getFeeding(feeding));
        target.finish();
        facade.calculate();
    }

    public static Country getCountry(int num) {
        switch (num) {
            case 1:
                return Country.Kyrgyzstan;
            case 2:
                return Country.Russia;
            case 3:
                return Country.USA;
            case 4:
                return Country.Germany;
            case 5:
                return Country.China;
        }
        return null;
    }

    public static Feeding getFeeding(int num) {
        switch (num) {
            case 1:
                return Feeding.TwoTimes;
            case 2:
                return Feeding.ThreeTimes;
            case 3:
                return Feeding.AllInclusive;
        }
        return null;
    }
}

class Facade {
    private Trip trip;
    private Target target;

    public Facade(Target target) {
        this.target = target;
    }

    public void setTrip(int num, int days, Country country, int stars, Feeding feeding) {
        switch (num) {
            case 1 -> {
                trip = new BeachRest();
                target.start();
            }
            case 2 -> {
                trip = new MountainSki();
                target.start();
            }
            case 3 -> {
                trip = new Excursion();
                target.start();
            }
            default -> System.out.println("Такой путевки не существует!");
        }
        trip.setDays(days);
        trip.setCountry(country);
        trip.setHotelStars(stars);
        trip.setFeeding(feeding);
    }

    public void calculate() {
        if (target.getCreated()) {
            System.out.println("Стоимость путевки: " + trip.calculatePrice());
        } else {
            System.out.println("Расчет невозможен!");
        }
    }
}

class Target {
    private boolean isCreated;

    public void start() {
        isCreated = true;
    }

    public void finish() {
        isCreated = false;
    }

    public boolean getCreated() {
        return isCreated;
    }
}
