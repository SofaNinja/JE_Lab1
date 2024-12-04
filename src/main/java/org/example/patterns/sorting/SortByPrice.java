package org.example.patterns.sorting;

import org.example.patterns.model.Car;

import java.util.List;
import java.util.Comparator;

public class SortByPrice implements CarSortingStrategy {
    @Override
    public void sort(List<Car> cars) {
        cars.sort(Comparator.comparing(Car::getPrice));
        System.out.println("Cars sorted by price:");
        cars.forEach(Car::displayDetails);
    }
}
