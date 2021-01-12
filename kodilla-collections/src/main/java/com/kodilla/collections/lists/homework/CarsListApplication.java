package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List <Mercedes> cars = new ArrayList<>();
        cars.add(new Mercedes(25));
        Mercedes mercedes2 = new Mercedes(100);
        cars.add(mercedes2);
        cars.add(new Mercedes(345));

        for (Mercedes mercedes : cars) {
            System.out.println(CarUtils.describeCar(mercedes));
        }

        cars.remove(0);

        cars.remove(mercedes2);

        System.out.println("Cars size is: " + cars.size());
        for (Mercedes mercedes : cars) {
            System.out.println(CarUtils.describeCar(mercedes));
        }
   }
}
