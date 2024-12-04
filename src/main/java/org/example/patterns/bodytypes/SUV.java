package org.example.patterns.bodytypes;

import org.example.patterns.model.Car;

public class SUV extends Car {
    public SUV(String name, double price, int year) {
        super(name, price, year);
    }

    @Override
    public void displayDetails() {
        System.out.println("SUV: " + getName() + ", Price: " + getPrice() + ", Year: " + getYear());
    }
}
