package com.kodilla.inheritance.homework;

public class OperatingSystemB extends OperatingSystem {

    public OperatingSystemB(int year){
        super(year);

    }
    @Override
    public void turnOn(){
        System.out.println("Turn on after 2 seconds");
    }
}
