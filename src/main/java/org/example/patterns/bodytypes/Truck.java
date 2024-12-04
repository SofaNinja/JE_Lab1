package org.example.patterns.bodytypes;

import org.example.patterns.model.Car;

public class Truck extends Car {
    public Truck(String name, double price, int year) {
        super(name, price, year);
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck: " + getName() + ", Price: " + getPrice() + ", Year: " + getYear());
    }
}
