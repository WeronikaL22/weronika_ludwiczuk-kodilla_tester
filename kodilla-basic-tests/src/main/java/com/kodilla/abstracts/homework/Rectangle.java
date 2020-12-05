package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
    this.height= height;
    this.width= width;

    }

    @Override
    public double calculateArea() {

        return this.height*this.width;
    }

    @Override
    public double calculatePerimeter() {
        return 2*this.height+2*this.width;
    }

}
