package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle(int width, int heigth) {

        super(width, heigth);
    }

    @Override
    public int calculateArea() {

        return getHeigth()*getWidth()/2;
    }

    @Override
    public int calculatePerimeter() {
        int sidea = 3;
        int sideb=  4;
        int sidec=  5;
        return sidea+sideb+sidec;
    }
}
