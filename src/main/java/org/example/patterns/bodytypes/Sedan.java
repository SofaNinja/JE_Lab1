package org.example.patterns.bodytypes;

import org.example.patterns.model.Car;

public class Sedan extends Car {
    public Sedan(String name, double price, int year) {
        super(name, price, year);
    }

    @Override
    public void displayDetails() {
        System.out.println("Sedan: " + getName() + ", Price: " + getPrice() + ", Year: " + getYear());
    }
}
