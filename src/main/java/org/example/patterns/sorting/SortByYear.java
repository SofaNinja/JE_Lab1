package org.example.patterns.sorting;

import org.example.patterns.model.Car;

import java.util.List;
import java.util.Comparator;

public class SortByYear implements CarSortingStrategy {
    @Override
    public void sort(List<Car> cars) {
        cars.sort(Comparator.comparing(Car::getYear));
        System.out.println("Cars sorted by year:");
        cars.forEach(Car::displayDetails);
    }
}
