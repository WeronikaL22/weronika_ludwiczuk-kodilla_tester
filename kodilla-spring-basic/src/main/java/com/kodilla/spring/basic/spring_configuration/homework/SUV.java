package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car {
    @Override
    public String getCarType(){

        return "SUV";
    }
    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime lt = LocalTime.now();
        return lt.getHour() < 6 || lt.getHour() >= 20;
    }

}
