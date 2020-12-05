package com.kodilla.inheritance.homework;

public class OperatingSystemA extends OperatingSystem {

    public OperatingSystemA(int year){
        super(year);

    }
    @Override
    public void turnOff(){
        System.out.println("Turn off after 3 seconds");
    }
}
