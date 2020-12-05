package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1978);
        //operatingSystem.turnOn();

        OperatingSystemA operatingSystemA = new OperatingSystemA(2001);
        operatingSystemA.turnOff();
        operatingSystemA.displayYear();
        OperatingSystemB operatingSystemB = new OperatingSystemB(2020);
        operatingSystemB.turnOn();
        operatingSystemB.displayYear();


    }
}
