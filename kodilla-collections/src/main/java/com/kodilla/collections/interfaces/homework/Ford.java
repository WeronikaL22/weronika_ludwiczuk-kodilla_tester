package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private int speed=0;

    public Ford() {

        this.speed =speed;
    }

    public void increaseSpeed() {
        speed += 15;
    }

    public void decreaseSpeed() {
        speed -= 5;
    }

    public int getSpeed() {
        return speed;
    }
}

