package org.example.patterns.sorting;

import org.example.patterns.model.Car;

import java.util.List;

public interface CarSortingStrategy {
    void sort(List<Car> cars);
}
