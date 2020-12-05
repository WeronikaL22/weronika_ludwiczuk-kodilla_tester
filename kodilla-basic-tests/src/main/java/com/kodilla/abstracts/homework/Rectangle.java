package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{

    public Rectangle(int width, int heigth) {

        super(width, heigth);
    }

    @Override
    public int calculateArea() {

        return getHeigth()*getWidth();
    }

    @Override
    public int calculatePerimeter() {
        return getWidth()*2 + getHeigth()*2;
    }
}
