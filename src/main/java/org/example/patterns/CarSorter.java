package org.example.patterns;

import org.example.patterns.model.Car;
import org.example.patterns.sorting.CarSortingStrategy;

import java.util.List;

public class CarSorter {
    private CarSortingStrategy strategy;

    public void setStrategy(CarSortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortCars(List<Car> cars) {
        if (strategy == null) {
            throw new IllegalStateException("Sorting strategy is not set!");
        }
        strategy.sort(cars);
    }
}
