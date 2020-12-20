package com.kodilla.collections.interfaces.homework;

public class Mercedes implements Car {

    private int speed;

    public Mercedes() {
    }

    public void increaseSpeed() {
        speed += 20;
    }

    public void increaseSpeed(int speedIncrease) {
        speed += speedIncrease;
    }

    public void decreaseSpeed(){
        speed -= 5;
    }

    public int getSpeed(){
        return speed;
    };
}


