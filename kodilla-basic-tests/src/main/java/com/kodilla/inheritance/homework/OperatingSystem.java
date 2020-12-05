package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year){
        this.year = year;
    }

    public void turnOn(){
        System.out.println("Turn on this system");
    }
    public void turnOff(){
        System.out.println("Turn off this system");

    }
    public int getYear(){
        return year;
    }
    public void displayYear(){
        System.out.println("The production year is " + year);
    }

}
