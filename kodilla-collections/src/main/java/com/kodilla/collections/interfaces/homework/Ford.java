package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int speed;

    public Ford() {
    }

    public void increaseSpeed() {
        speed += 15;
    }

    public void increaseSpeed(int speedIncrease) {
        speed += speedIncrease;
    }

    public void decreaseSpeed() {
        speed -= 5;
    }

    public int getSpeed() {
        return speed;
    }
}

