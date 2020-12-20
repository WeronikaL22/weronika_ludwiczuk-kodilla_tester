package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Skoda;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = random.nextInt(15) + 1;

        Car [] cars = new Car[arrayLength];

        System.out.println(arrayLength + " cars.");

        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);

    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);

        Car car;
        if (drawnCarKind == 0)
            car = new Ford();
        else if (drawnCarKind == 1)
            car =  new Mercedes();
        else
            car =  new Skoda();

        int randomSpeedIncrease = random.nextInt(30);

        car.increaseSpeed(randomSpeedIncrease);

        return car;
    }
}

