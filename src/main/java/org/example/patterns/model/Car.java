package org.example.patterns.model;

public abstract class Car {
    private String name;
    private double price;
    private int year;

    public Car(String name, double price, int year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public abstract void displayDetails();
}
