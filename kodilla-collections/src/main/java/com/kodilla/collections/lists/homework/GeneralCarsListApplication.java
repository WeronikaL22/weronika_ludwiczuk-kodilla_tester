package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Skoda;

import java.util.LinkedList;
import java.util.List;

public class GeneralCarsListApplication {
       public static void main(String[] args) {
            List<Car> cars = new LinkedList<>();
            Mercedes mercedes = new Mercedes(); //obiekt klasy Mercedes zapamiętany w zmiennej merecedes
            cars.add(mercedes); //wstawiam ten obiekt do kolekcji
            cars.add(new Ford());
            cars.add(new Skoda());

            cars.remove(1);   //deleting Ford, index 1
            cars.remove(mercedes); //deleting mercedes using Object deleting

            System.out.println(cars.size());
       }
}
