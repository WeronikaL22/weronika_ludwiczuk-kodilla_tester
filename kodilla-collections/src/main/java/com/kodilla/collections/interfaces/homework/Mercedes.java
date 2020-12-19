package com.kodilla.collections.interfaces.homework;

public class Mercedes implements Car {

    private int speed=0;
    ;

    public Mercedes() {
        this.speed = speed;
    }
    public void increaseSpeed(){
        speed += 20;
    }

    public void decreaseSpeed(){
        speed -= 5;
    }

    public int getSpeed(){
        return speed;
    };
}


