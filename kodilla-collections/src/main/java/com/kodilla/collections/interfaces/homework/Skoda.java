package com.kodilla.collections.interfaces.homework;

public class Skoda implements Car {

    private int speed=0;

    public Skoda(){
        this.speed = speed;
    }

    public void increaseSpeed(){
        speed += 10;
    }

    public void decreaseSpeed(){
        speed -= 5;
    }

    public int getSpeed(){
        return speed;
    };
}
