package org.example;

import org.example.patterns.*;
import org.example.patterns.model.Car;
import org.example.patterns.sorting.SortByPrice;
import org.example.patterns.sorting.SortByYear;

import java.util.*;

public class CarDealership {
    public static void main(String[] args) {
        // Singleton: Під'єднання до бази даних
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        if (dbConnection.getConnection() != null) {
            System.out.println("Database connected successfully.");
        }

        // Factory: Створення авто
        List<Car> cars = new ArrayList<>();
        cars.add(CarFactory.createCar("Sedan", "Toyota Camry", 25000.0, 2022));
        cars.add(CarFactory.createCar("SUV", "Honda CR-V", 28000.0, 2021));
        cars.add(CarFactory.createCar("Truck", "Ford F-150", 40000.0, 2023));

        System.out.println("\nCar Details:");
        cars.forEach(Car::displayDetails);

        // Strategy: Сортування авто
        CarSorter sorter = new CarSorter();

        // Сортування за ціною
        System.out.println("\n");
        sorter.setStrategy(new SortByPrice());
        sorter.sortCars(cars);

        // Сортування за роком
        System.out.println("\n");
        sorter.setStrategy(new SortByYear());
        sorter.sortCars(cars);
    }
}
