package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Ford ford = new Ford();
        doRace(ford);

        Skoda skoda = new Skoda();
        doRace(skoda);

        Mercedes mercedes = new Mercedes();
        doRace(mercedes);
    }

    private static void doRace(Car car) {

        for (int i = 1; i <= 3; i++) {
            car.increaseSpeed();
            System.out.println("Current speed is " + car.getSpeed());
            }
            for(int i = 1; i<=2; i++){
            car.decreaseSpeed();
            System.out.println("Current speed is " + car.getSpeed());
            }
        }

}











