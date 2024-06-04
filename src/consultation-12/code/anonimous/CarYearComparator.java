package anonimous;/*
@date 25.05.2024
@author Sergey Bugaienko
*/

import java.util.Comparator;

public class CarYearComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getYear() - car2.getYear();
    }
}
