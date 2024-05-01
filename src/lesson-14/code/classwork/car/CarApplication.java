package classwork.car;

import classwork.car.model.Car;

public class CarApplication {
    public static void main(String[] args) {

        Car car = new Car("black","Maserati",false, 25000, 2017,258000); // стринг всегда кавычки

        car.displayCar();
        car.moveCar();
    }
}
