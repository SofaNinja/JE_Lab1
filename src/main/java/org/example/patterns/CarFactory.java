package org.example.patterns;

import org.example.patterns.model.Car;
import org.example.patterns.bodytypes.SUV;
import org.example.patterns.bodytypes.Sedan;
import org.example.patterns.bodytypes.Truck;

public class CarFactory {
    public static Car createCar(String type, String name, double price, int year) {
        switch (type) {
            case "Sedan":
                return new Sedan(name, price, year);
            case "SUV":
                return new SUV(name, price, year);
            case "Truck":
                return new Truck(name, price, year);
            default:
                throw new IllegalArgumentException("Unknown car type: " + type);
        }
    }
}
