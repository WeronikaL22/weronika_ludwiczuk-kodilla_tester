package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Skoda;

public class CarUtils {
    public static String describeCar(Car car) {
       // System.out.println("-----------------------------");
       // System.out.println("Car kind: " + getCarName(car));
       // System.out.println("Car speed is: " + car.getSpeed());
        return "Car kind: " + getCarName(car) +"." + "Car speed is " + car.getSpeed();
    }

    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Mercedes)
            return "Mercedes";
        else if (car instanceof Skoda)
            return "Skoda";
        else
            return "Unknown car name";
    }
}


