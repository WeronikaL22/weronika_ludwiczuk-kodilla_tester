package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int width;
    private int heigth;

    public Shape(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public int getWidth() {

        return width;
    }

    public int getHeigth() {

        return heigth;
    }

    public abstract int calculateArea();

    public abstract int calculatePerimeter();
}


